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
	
	private String mode = null;
	public FindTipAction(String mode) {
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
			TipTableDAO dao = TipTableDAO.getInstance();
			if (mode.contentEquals("findtitle")) {
				TipElementBean tie = dao.titleselect(conn, title);
				if (tie == null) {
					throw new NotFoundException("TipElement Not found : " + title);
				}
				request.setAttribute("tie", tie);
				request.setAttribute("title", title);
			} else if(mode.contentEquals("findwriter")) {
				TipElementBean tie = dao.writerselect(conn, name);
				if (tie == null) {
					throw new NotFoundException("TipElement Not found : " + name);
				}
				request.setAttribute("tie", tie);
				request.setAttribute("name", name);
			} else {
				TipElementBean tie = dao.select(conn, number);
				if (tie == null) {
					throw new NotFoundException("TipElement Not found : " + number);
				}
				request.setAttribute("tie", tie);
				request.setAttribute("number", number);
			}
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
