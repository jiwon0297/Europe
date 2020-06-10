package action_edit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import action.*;
import dao.ReviewTableDAO;
import jdbc.ConnectionProvider;

import javax.servlet.RequestDispatcher;
import java.io.File;
import java.io.IOException;

public class EditReviewAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String directory = request.getServletContext().getRealPath("/upload/");
		MultipartRequest multi = null;
		int maxSize= 10* 1024 * 1024;
		String encoding = "UTF-8";
		
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			multi = new MultipartRequest(request,directory,maxSize,encoding, new DefaultFileRenamePolicy());
			
			int number = Integer.parseInt(multi.getParameter("number"));
			String country = multi.getParameter("country");
			String cate1 = multi.getParameter("cate1");
			String title = multi.getParameter("title");
			String detail = multi.getParameter("detail");
			String fileName = multi.getParameter("fileName");
			String fileRealName = multi.getParameter("fileRealName");

			dao.edit(conn, number, country, cate1, title, detail,fileName,fileRealName);
			
			System.out.println("Success Edit ReviewElement");
		} catch(SQLException e){
			throw new ServiceException("EditReviewAction Error " + e.getMessage());
		} catch(IOException e1) {
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
