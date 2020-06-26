package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.NotFoundException;
import action.ServiceException;
import dao.TravelTableDAO;
import dto.TravelElementBean;
import jdbc.ConnectionProvider;

public class FindTravelAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
			Connection conn = null;
			try {
				int number = Integer.parseInt(request.getParameter("number"));
				
				conn = ConnectionProvider.getConnection();
				TravelTableDAO dao = TravelTableDAO.getInstance();
				TravelElementBean tList = dao.select(conn, number);
				if (tList == null) {
					throw new NotFoundException("Element Not found : " + number);
				}
				request.setAttribute("tList", tList);
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
