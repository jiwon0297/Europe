package action_add;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.*;
import dao.ReviewTableDAO;
import jdbc.ConnectionProvider;

public class AddReviewAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		HttpSession session = request.getSession(true);
		String country = request.getParameter("country");
		String cate1 = request.getParameter("cate1");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String detail = request.getParameter("detail");
		try {
			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			int catee = dao.cate(conn, cate1, country);
					
			if(catee==1) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==2) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==3) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==4) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==5) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==6) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==7) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==8) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==9) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==10) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==11) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==12) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==13) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==14) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==15) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==16) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==17) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==18) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==19) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==20) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==21) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==22) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==23) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} else if(catee==24) {
				dao.insert(conn, country, cate1, name, title, detail);
				session.setAttribute("catee", catee);
			} 
			
			
		} catch(SQLException e){
			throw new ServiceException("AddReviewAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
