package action_add;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.ReviewTableDAO;
import dto.ReviewElementBean;
import jdbc.ConnectionProvider;

public class AddReviewAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			String country = request.getParameter("country");
			String cate1 = request.getParameter("cate1");
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			String detail = request.getParameter("detail");

			ReviewElementBean re = new ReviewElementBean(number, country, cate1, name, title, detail);
			System.out.println(re);
			
			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			dao.insert(conn, re);
			
			System.out.println("Success Add ReviewElement");
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
