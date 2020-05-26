package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionProvider;
import action.*;
import dao.TogetherTableDAO;
import dto.MarketElementBean;
import dto.TogetherElementBean;


public class ListTogetherAction implements Action {
	private String mode = null;
	public ListTogetherAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			String country = request.getParameter("country");
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			conn = ConnectionProvider.getConnection();
			TogetherTableDAO dao = TogetherTableDAO.getInstance();
			if(mode.contentEquals("listbycountry")) {
				List<TogetherElementBean> toList = dao.selectListByCountry(conn, country);
				request.setAttribute("toList", toList);
				request.setAttribute("country", country);
				
			} else if(mode.contentEquals("list")) {
				List<TogetherElementBean> toList = dao.selectList(conn);
				request.setAttribute("toList", toList);
				request.setAttribute("mode", mode);
			} else if(mode.contentEquals("titleselect")) {
				List<TogetherElementBean> toList = dao.titleselect(conn, title);
				request.setAttribute("toList", toList);
				request.setAttribute("mode", mode);
			} else if(mode.contentEquals("writerselect")) {
				List<TogetherElementBean> toList = dao.writerselect(conn, name);
				request.setAttribute("toList", toList);
				request.setAttribute("mode", mode);
			}
		} catch(SQLException e){
			throw new ServiceException("ListTogetherAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}