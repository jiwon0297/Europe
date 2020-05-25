package action_delete;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberTableDAO;
import jdbc.ConnectionProvider;
import action.*;

public class DeleteMemberAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			String id = request.getParameter("id");
			
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			MemberTableDAO dao = MemberTableDAO.getInstance();
			dao.delete(conn, id);
			conn.commit();
			System.out.println("Success Delete MemberElement");
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
