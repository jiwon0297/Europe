package action_edit;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.TipTableDAO;
import dto.TipElementBean;
import jdbc.ConnectionProvider;

public class EditTipAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			String country = request.getParameter("country");
			String cate1 = request.getParameter("cate2");
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			String detail = request.getParameter("detail");

			TipElementBean tie = new TipElementBean(number, country, cate1, name, title, detail);
			System.out.println(tie);
			
			conn = ConnectionProvider.getConnection();
			TipTableDAO dao = TipTableDAO.getInstance();
			dao.edit(conn, tie);
			
			System.out.println("Success Edit TipElement");
		} catch(SQLException e){
			throw new ServiceException("EditTipAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
