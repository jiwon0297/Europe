package action_add;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.NewsTableDAO;
import dto.NewsElementBean;
import jdbc.ConnectionProvider;

public class AddNewsAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			String title = request.getParameter("title");
			String detail = request.getParameter("detail");
			String writer = request.getParameter("writer");

			NewsElementBean ne = new NewsElementBean(number, title, detail, writer);
			System.out.println(ne);
			
			conn = ConnectionProvider.getConnection();
			NewsTableDAO dao = NewsTableDAO.getInstance();
			dao.insert(conn, ne);
			
			System.out.println("Success Add News");
		} catch(SQLException e){
			throw new ServiceException("AddNewsAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
