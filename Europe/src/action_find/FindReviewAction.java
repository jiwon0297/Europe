package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.MemberTableDAO;
import dao.ReviewTableDAO;
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
