package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.ConnectionProvider;
import action.*;
import dao.MemberTableDAO;
import dto.MemberElementBean;


public class ListMemberAction implements Action {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(true);
		Connection conn = null;
		try {
			String id = (String)session.getAttribute("id");
			conn = ConnectionProvider.getConnection();
			MemberTableDAO dao = MemberTableDAO.getInstance();
			List<MemberElementBean> member = dao.infolist(conn, id);
			request.setAttribute("member", member);
		} catch(SQLException e){
			throw new ServiceException("ListMemberAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
