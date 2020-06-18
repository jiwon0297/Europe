package action_find;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.CommentDAO;
import dao.MemberTableDAO;
import dao.ReviewTableDAO;
import dto.CommentElementBean;
import dto.MemberElementBean;
import dto.ReviewElementBean;
import jdbc.ConnectionProvider;

public class FindReviewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));

			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			ReviewElementBean re = dao.select(conn, number);
			
			if (re == null) {
				throw new NotFoundException("ReviewElement Not found : " + number);
			}
			
			// �Խñ� ��ȣ�� �̿��Ͽ� �ش� �ۿ� �ִ� ��� ����� �����´�.
	        CommentDAO commentDAO = CommentDAO.getInstance();
	        ArrayList<CommentElementBean> commentList = commentDAO.getCommentList(number);
	        
	        // ����� 1���� �ִٸ� request�� commentList�� �����Ѵ�.
	        if(commentList.size() > 0)    request.setAttribute("commentList", commentList);

			
			request.setAttribute("re", re);
			request.setAttribute("number", number);
			
		} catch(SQLException e){
			throw new ServiceException("FindReviewAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
