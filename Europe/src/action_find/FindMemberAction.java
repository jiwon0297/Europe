package action_find;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.MemberTableDAO;
import dto.MemberElementBean;
import jdbc.ConnectionProvider;

public class FindMemberAction implements Action {
	
	private String mode = null;
	public FindMemberAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			MemberTableDAO dao = MemberTableDAO.getInstance();
			if (mode.contentEquals("findid")) {
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String phone = request.getParameter("phone");
				MemberElementBean member = dao.findid(conn, name, email, phone);
				if (member == null) {
					throw new NotFoundException("MemberElement Not found : " + name);
				}
				request.setAttribute("member", member);
			} else if(mode.contentEquals("findpassword")) {
				String id = request.getParameter("id");
				String email = request.getParameter("email");
				MemberElementBean member = dao.findpassword(conn, id, email);
				if (member == null) {
					throw new NotFoundException("MemberElement Not found : " + id);
				}
				request.setAttribute("member", member);
			} else if(mode.contentEquals("select")) {
				String id = request.getParameter("id");
				MemberElementBean member = dao.select(conn, id);
				if (member == null) {
					throw new NotFoundException("MemberElement Not found : " + id);
				}
				request.setAttribute("member", member);
			} 
		} catch(SQLException e){
			throw new ServiceException("FindMemberAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
