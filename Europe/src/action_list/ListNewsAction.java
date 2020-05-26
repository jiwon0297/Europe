package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionProvider;
import action.*;
import dao.NewsTableDAO;
import dto.MarketElementBean;
import dto.NewsElementBean;


public class ListNewsAction implements Action {
	
	private String mode = null;
	public ListNewsAction(String mode) {
		this.mode = mode;
	}
	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			String writer = request.getParameter("writer");
			String title = request.getParameter("title");
			
			conn = ConnectionProvider.getConnection();
			NewsTableDAO dao = NewsTableDAO.getInstance();
			
			if (mode.contentEquals("list")) {
				List<NewsElementBean> nList = dao.selectList(conn);
				request.setAttribute("nList", nList);			
			} else if(mode.contentEquals("titleselect")) {
				List<NewsElementBean> nList = dao.titleselect(conn, title);
				request.setAttribute("nList", nList);
				request.setAttribute("mode", mode);
			} else if(mode.contentEquals("writerselect")) {
				List<NewsElementBean> nList = dao.writerselect(conn, writer);
				request.setAttribute("nList", nList);
				request.setAttribute("mode", mode);
			}
		} catch(SQLException e){
			throw new ServiceException("ListNewsAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
