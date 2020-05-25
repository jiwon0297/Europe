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
	
	private String mode = null;
	public FindNewsAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			conn = ConnectionProvider.getConnection();
			NewsTableDAO dao = NewsTableDAO.getInstance();
			if (mode.contentEquals("findtitle")) {
				NewsElementBean ne = dao.titleselect(conn, title);
				if (ne == null) {
					throw new NotFoundException("NewsElement Not found : " + title);
				}
				request.setAttribute("ne", ne);
				request.setAttribute("title", title);
			} else if(mode.contentEquals("findwriter")) {
				NewsElementBean ne = dao.writerselect(conn, writer);
				if (ne == null) {
					throw new NotFoundException("NewsElement Not found : " + writer);
				}
				request.setAttribute("ne", ne);
				request.setAttribute("writer", writer);
			} else {
				NewsElementBean ne = dao.select(conn, number);
				if (ne == null) {
					throw new NotFoundException("NewsElement Not found : " + number);
				}
				request.setAttribute("ne", ne);
				request.setAttribute("number", number);
			}
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
