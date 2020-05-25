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
	
	private String mode = null;
	public FindTogetherAction(String mode) {
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
			TogetherTableDAO dao = TogetherTableDAO.getInstance();
			if (mode.contentEquals("findtitle")) {
				TogetherElementBean toe = dao.titleselect(conn, title);
				if (toe == null) {
					throw new NotFoundException("TogetherElement Not found : " + title);
				}
				request.setAttribute("toe", toe);
				request.setAttribute("title", title);
			} else if(mode.contentEquals("findwriter")) {
				TogetherElementBean toe = dao.writerselect(conn, name);
				if (toe == null) {
					throw new NotFoundException("TogetherElement Not found : " + name);
				}
				request.setAttribute("toe", toe);
				request.setAttribute("name", name);
			} else {
				TogetherElementBean toe = dao.select(conn, number);
				if (toe == null) {
					throw new NotFoundException("TogetherElement Not found : " + number);
				}
				request.setAttribute("toe", toe);
				request.setAttribute("number", number);
			}
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
