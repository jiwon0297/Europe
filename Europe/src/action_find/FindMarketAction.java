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
	
	private String mode = null;
	public FindMarketAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			conn = ConnectionProvider.getConnection();
			MarketTableDAO dao = MarketTableDAO.getInstance();
			if (mode.contentEquals("findtitle")) {
				MarketElementBean me = dao.titleselect(conn, title);
				if (me == null) {
					throw new NotFoundException("MarketElement Not found : " + title);
				}
				request.setAttribute("me", me);
				request.setAttribute("title", title);
			} else if(mode.contentEquals("findwriter")) {
				MarketElementBean me = dao.writerselect(conn, name);
				if (me == null) {
					throw new NotFoundException("MarketElement Not found : " + name);
				}
				request.setAttribute("me", me);
				request.setAttribute("name", name);
			} else {
				MarketElementBean me = dao.select(conn, number);
				if (me == null) {
					throw new NotFoundException("MarketElement Not found : " + number);
				}
				request.setAttribute("me", me);
				request.setAttribute("number", number);
			}
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
