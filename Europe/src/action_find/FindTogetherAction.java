package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.TogetherTableDAO;
import dto.TogetherElementBean;
import jdbc.ConnectionProvider;

public class FindTogetherAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));

			conn = ConnectionProvider.getConnection();
			TogetherTableDAO dao = TogetherTableDAO.getInstance();
			TogetherElementBean toe = dao.select(conn, number);
			if (toe == null) {
				throw new NotFoundException("TogetherElement Not found : " + number);
			}
			request.setAttribute("toe", toe);
			request.setAttribute("number", number);
		} catch(SQLException e){
			throw new ServiceException("FindTogetherAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
