package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.NewsTableDAO;
import dto.NewsElementBean;
import jdbc.ConnectionProvider;

public class FindNewsAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));

			conn = ConnectionProvider.getConnection();
			NewsTableDAO dao = NewsTableDAO.getInstance();
			NewsElementBean ne = dao.select(conn, number);
			if (ne == null) {
				throw new NotFoundException("NewsElement Not found : " + number);
			}
			request.setAttribute("ne", ne);
			request.setAttribute("number", number);
		} catch(SQLException e){
			throw new ServiceException("FindNewsAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
