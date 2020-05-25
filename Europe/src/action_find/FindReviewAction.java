package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.ReviewTableDAO;
import dto.ReviewElementBean;
import jdbc.ConnectionProvider;

public class FindReviewAction implements Action {
	
	private String mode = null;
	public FindReviewAction(String mode) {
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
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			if (mode.contentEquals("findtitle")) {
				ReviewElementBean re = dao.titleselect(conn, title);
				if (re == null) {
					throw new NotFoundException("ReviewElement Not found : " + title);
				}
				request.setAttribute("re", re);
				request.setAttribute("title", title);
			} else if(mode.contentEquals("findwriter")) {
				ReviewElementBean re = dao.writerselect(conn, name);
				if (re == null) {
					throw new NotFoundException("ReviewElement Not found : " + name);
				}
				request.setAttribute("re", re);
				request.setAttribute("name", name);
			} else {
				ReviewElementBean re = dao.select(conn, number);
				if (re == null) {
					throw new NotFoundException("ReviewElement Not found : " + number);
				}
				request.setAttribute("re", re);
				request.setAttribute("number", number);
			}
		} catch(SQLException e){
			throw new ServiceException("FindReviewAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
