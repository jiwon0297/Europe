package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.MarketTableDAO;
import dto.MarketElementBean;
import jdbc.ConnectionProvider;

public class FindMarketAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));

			conn = ConnectionProvider.getConnection();
			MarketTableDAO dao = MarketTableDAO.getInstance();
			
			MarketElementBean me = dao.select(conn, number);
			
			if (me == null) {
				throw new NotFoundException("MarketElement Not found : " + number);
			}
			request.setAttribute("me", me);
			request.setAttribute("number", number);
			
		} catch(SQLException e){
			throw new ServiceException("FindMarketAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
