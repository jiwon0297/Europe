package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import action.NotFoundException;
import action.ServiceException;
import dao.TravelTableDAO;
import dto.TravelElementBean;
import jdbc.ConnectionProvider;

public class ListTravelAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			HttpSession session = request.getSession(true);
			String id = (String)session.getAttribute("userID");

			conn = ConnectionProvider.getConnection();
						
			// �Խñ� ��ȣ�� �̿��Ͽ� �ش� �ۿ� �ִ� ��� ����� �����´�.
	        TravelTableDAO traveltableDAO = TravelTableDAO.getInstance();
	        ArrayList<TravelElementBean> tList = traveltableDAO.getCommentList(id);
	        
	        // ����� 1���� �ִٸ� request�� commentList�� �����Ѵ�.
	        if(tList.size() > 0)    request.setAttribute("tList", tList);
		} catch(SQLException e){
			throw new ServiceException("ListReviewAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
