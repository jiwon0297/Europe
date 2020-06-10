package action_edit;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.*;
import dao.ReviewTableDAO;
import dto.ReviewElementBean;
import jdbc.ConnectionProvider;

public class EditReviewAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			int number = Integer.parseInt(request.getParameter("number"));
			String country = request.getParameter("country");
			String cate1 = request.getParameter("cate1");
			String title = request.getParameter("title");
			String detail = request.getParameter("detail");
			String fileName = request.getParameter("fileName");
			String fileRealName = request.getParameter("fileRealName");
			
			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			dao.edit(conn, number, country, cate1, title, detail,fileName,fileRealName);
			
			System.out.println("Success Edit ReviewElement");
		} catch(SQLException e){
			throw new ServiceException("EditReviewAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
