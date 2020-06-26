package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.NotFoundException;
import action.ServiceException;
import dao.LocationTableDAO;
import dao.TravelTableDAO;
import dto.LocationElementBean;
import dto.TravelElementBean;
import jdbc.ConnectionProvider;

public class FindLocationAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
			Connection conn = null;
			try {
				int number = Integer.parseInt(request.getParameter("number"));
				
				conn = ConnectionProvider.getConnection();
				LocationTableDAO dao = LocationTableDAO.getInstance();
				LocationElementBean lList = dao.select(conn, number);

				if (lList == null) {
					throw new NotFoundException("Element Not found : " + number);
				}
				request.setAttribute("lList", lList);
				request.setAttribute("number", number);
			} catch(SQLException e){
				throw new ServiceException("FindPeriodicElement Error " + e.getMessage());
			} finally {
				try {
					if(conn!=null) conn.close();
				} catch(SQLException se){
					se.printStackTrace();
				}
			}

	}
}
