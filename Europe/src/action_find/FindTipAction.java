package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.TipTableDAO;
import dto.TipElementBean;
import jdbc.ConnectionProvider;

public class FindTipAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));

			conn = ConnectionProvider.getConnection();
			TipTableDAO dao = TipTableDAO.getInstance();
			TipElementBean tie = dao.select(conn, number);
			if (tie == null) {
				throw new NotFoundException("TipElement Not found : " + number);
			}
			request.setAttribute("tie", tie);
			request.setAttribute("number", number);
		} catch(SQLException e){
			throw new ServiceException("FindTipAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
