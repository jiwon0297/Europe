package action_delete;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import dao.LocationTableDAO;
import dao.TravelTableDAO;
import dto.LocationElementBean;
import jdbc.ConnectionProvider;

public class MyCountryDeleteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			LocationTableDAO dao = LocationTableDAO.getInstance();
			dao.deleteLocation(number);

			System.out.println("Success Delete Element");
		} catch(SQLException e){
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(conn!=null) conn.close();
				} catch(SQLException se){
					se.printStackTrace();
				}
			}
		}
	}

}
