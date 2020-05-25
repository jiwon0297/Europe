package action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberTableDAO;
import jdbc.ConnectionProvider;

public class LoginAction implements Action {
	private String mode = null;
	public LoginAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		if(mode=="login") {
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			Connection conn = null;
			try{
				conn = ConnectionProvider.getConnection();
				MemberTableDAO dao = MemberTableDAO.getInstance();
				int member = dao.login(conn, id, pw);
				if(member == 1){
					session.setAttribute("userID", id);
					session.setAttribute("userPW", pw);
					session.setAttribute("member", member);
				} else {
					session.setAttribute("member", member);
				}
			
			} catch(SQLException e){
				e.printStackTrace();
			} finally {
				try {
					if(conn!=null) conn.close();
				} catch(SQLException se){
					se.printStackTrace();
				}
			}
		} else if(mode=="logout") {
			session.invalidate();
		}
	} 
}
