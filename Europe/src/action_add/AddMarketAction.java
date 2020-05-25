package action_add;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.MarketTableDAO;
import dto.MarketElementBean;
import jdbc.ConnectionProvider;

public class AddMarketAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			String country = request.getParameter("country");
			String cate3 = request.getParameter("cate3");
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			String detail = request.getParameter("detail");

			MarketElementBean me = new MarketElementBean(number, country, cate3, name, title, detail);
			System.out.println(me);
			
			conn = ConnectionProvider.getConnection();
			MarketTableDAO dao = MarketTableDAO.getInstance();
			dao.insert(conn, me);
			
			System.out.println("Success Add MarketElement");
		} catch(SQLException e){
			throw new ServiceException("AddMarketAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
