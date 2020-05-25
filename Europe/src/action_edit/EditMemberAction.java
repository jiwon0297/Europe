package action_edit;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.MemberTableDAO;
import jdbc.ConnectionProvider;

public class EditMemberAction implements Action {
	private String mode = null;
	public EditMemberAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			MemberTableDAO dao = MemberTableDAO.getInstance();
			if (mode.contentEquals("password")) {
				String id = request.getParameter("id");
				String password = request.getParameter("password");

				dao.passwordedit(conn, id, password);
				System.out.println("Success Edit Password");
			} else if(mode.contentEquals("nickname")) {
				String id = request.getParameter("id");
				String nickname = request.getParameter("nickname");

				dao.passwordedit(conn, id, nickname);
				System.out.println("Success Edit Nickname");
			}
			
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
