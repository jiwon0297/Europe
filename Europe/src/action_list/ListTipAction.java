package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionProvider;
import action.*;
import dao.TipTableDAO;
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
				
			} else {
				List<TipElementBean> tiList = dao.selectList(conn);
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
