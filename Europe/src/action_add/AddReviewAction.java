package action_add;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.*;
import dao.ReviewTableDAO;
import jdbc.ConnectionProvider;

public class AddReviewAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;

		String country = request.getParameter("country");
		String cate1 = request.getParameter("cate1");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String detail = request.getParameter("detail");
		try {
			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();

			dao.insert(conn, country, cate1, name, title, detail);		
			
			
		} catch(SQLException e){
			throw new ServiceException("AddReviewAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
