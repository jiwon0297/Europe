package action_add;

import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.MemberTableDAO;
import dto.MemberElementBean;
import jdbc.ConnectionProvider;

public class AddMemberAction implements Action {
	private String mode = null;
	public AddMemberAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			MemberTableDAO dao = MemberTableDAO.getInstance();
			if (mode.contentEquals("join")) {
				String id = request.getParameter("id");
				String password = request.getParameter("password");
				String name = request.getParameter("name");
				String phone = request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3") ;
				String email = request.getParameter("email1") + "@" + request.getParameter("email2");
				String address = request.getParameter("address");
				String nickname= request.getParameter("nickname");
				String gender = request.getParameter("gender");
				MemberElementBean member = new MemberElementBean(id, password,name,phone,email,address,nickname,gender);
				dao.insert(conn, member);
			}
		} catch(SQLException e){
			throw new ServiceException("Member db access error" + e.getMessage(),e);
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	} 

}
