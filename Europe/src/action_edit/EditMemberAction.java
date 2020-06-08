package action_edit;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.MemberTableDAO;
import jdbc.ConnectionProvider;

public class EditMemberAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			MemberTableDAO dao = MemberTableDAO.getInstance();

				String id = request.getParameter("id");
				String password = request.getParameter("password");
				String nickname = request.getParameter("nickname");

				dao.passwordedit(conn, id, password, nickname);
				System.out.println("Success Edit Password");
			
		} catch(SQLException e){
			throw new ServiceException("EditMemberAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
