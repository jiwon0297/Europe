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
import java.io.File;
import java.io.IOException;

//파일이 중복될 경우 저절로 이름을 바꿔주는 import
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.MultipartRequest;

public class AddReviewAction implements Action {
	
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String directory = request.getServletContext().getRealPath("/upload/");
		int maxSize= 1024 * 1024 * 100;
		String encoding = "UTF-8";
	
		Connection conn = null;
		String country = request.getParameter("country");
		String cate1 = request.getParameter("cate1");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String detail = request.getParameter("detail");
		//String fileName = request.getParameter("fileName");
		//String fileRealName = request.getParameter("fileRealName");
		
		try {
			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			MultipartRequest multipartRequest = 
					new MultipartRequest(request,directory,maxSize,encoding,
							new DefaultFileRenamePolicy());
			String fileName = multipartRequest.getOriginalFileName("file");
			String fileRealName = multipartRequest.getFilesystemName("file");
			dao.insert(conn, country, cate1, name, title, detail,fileName,fileRealName);		
			System.out.println(fileName);	
			System.out.println(fileRealName);	
		} catch(SQLException e){
			throw new ServiceException("AddReviewAction Error " + e.getMessage());
		} catch(IOException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
