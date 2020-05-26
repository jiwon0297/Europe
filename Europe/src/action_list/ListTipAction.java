package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionProvider;
import action.*;
import dao.TipTableDAO;
import dto.MarketElementBean;
import dto.TipElementBean;


public class ListTipAction implements Action {
	private String mode = null;
	public ListTipAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			String country = request.getParameter("country");
			String category = request.getParameter("category");
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			conn = ConnectionProvider.getConnection();
			TipTableDAO dao = TipTableDAO.getInstance();
			if (mode.contentEquals("listbycategory")) {
				List<TipElementBean> tiList = dao.selectListByCategory(conn, category);
				request.setAttribute("tiList", tiList);
				request.setAttribute("category", category);
			} else if(mode.contentEquals("listbycountry")) {
				List<TipElementBean> tiList = dao.selectListByCountry(conn, country);
				request.setAttribute("tiList", tiList);
				request.setAttribute("country", country);
				
			} else if(mode.contentEquals("list")) {
				List<TipElementBean> tiList = dao.selectList(conn);
				request.setAttribute("tiList", tiList);
				request.setAttribute("mode", mode);
			} else if(mode.contentEquals("titleselect")) {
				List<TipElementBean> tiList = dao.titleselect(conn, title);
				request.setAttribute("tiList", tiList);
				request.setAttribute("mode", mode);
			} else if(mode.contentEquals("writerselect")) {
				List<TipElementBean> tiList = dao.writerselect(conn, name);
				request.setAttribute("tiList", tiList);
				request.setAttribute("mode", mode);
			}
		} catch(SQLException e){
			throw new ServiceException("ListTipAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
