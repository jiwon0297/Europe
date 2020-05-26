package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionProvider;
import action.*;
import dao.MarketTableDAO;
import dto.MarketElementBean;


public class ListMarketAction implements Action {
	private String mode = null;
	public ListMarketAction(String mode) {
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
			MarketTableDAO dao = MarketTableDAO.getInstance();
			if (mode.contentEquals("listbycategory")) {
				List<MarketElementBean> mList = dao.selectListByCategory(conn, category);
				request.setAttribute("mList", mList);
				request.setAttribute("category", category);
			} else if(mode.contentEquals("listbycountry")) {
				List<MarketElementBean> mList = dao.selectListByCountry(conn, country);
				request.setAttribute("mList", mList);
				request.setAttribute("country", country);		
			} else if(mode.contentEquals("list")) {
				List<MarketElementBean> mList = dao.selectList(conn);
				request.setAttribute("mList", mList);
				request.setAttribute("mode", mode);
			} else if(mode.contentEquals("titleselect")) {
				List<MarketElementBean> mList = dao.titleselect(conn, title);
				request.setAttribute("mList", mList);
				request.setAttribute("mode", mode);
			} else if(mode.contentEquals("writerselect")) {
				List<MarketElementBean> mList = dao.writerselect(conn, name);
				request.setAttribute("mList", mList);
				request.setAttribute("mode", mode);
			}
		} catch(SQLException e){
			throw new ServiceException("ListMarketAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
