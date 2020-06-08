package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionProvider;
import action.*;
import dao.ReviewTableDAO;
import dto.ReviewElementBean;


public class ListReviewAction implements Action {
	private String mode = null;
	public ListReviewAction(String mode) {
		this.mode = mode;
	}
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			String country;
			String category;
			String name = request.getParameter("name");
			String title = request.getParameter("title");
			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			// england
			if (mode.contentEquals("englandinfo")) {
				category = "Information";
				country = "England";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} else if(mode.contentEquals("englandmarket")) {
				country = "England";
				category = "Market";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);				
			} else if(mode.contentEquals("englandtogether")) {
				country = "England";
				category = "Together";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} 
			
			//france
			else if(mode.contentEquals("franceinfo")) {
				country = "France";
				category = "Information";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} else if(mode.contentEquals("francemarket")) {
				country = "France";
				category = "Market";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);				
			} else if(mode.contentEquals("francetogether")) {
				country = "France";
				category = "Together";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} 
			
			//korea
			else if(mode.contentEquals("koreainfo")) {
				country = "Korea";
				category = "Information";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category,country);
				request.setAttribute("rList", rList);
			} else if(mode.contentEquals("koreamarket")) {
				country = "Korea";
				category = "Market";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);				
			} else if(mode.contentEquals("koreatogether")) {
				country = "Korea";
				category = "Together";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} 
			
			//hungary
			else if(mode.contentEquals("hungaryinfo")) {
				country = "Hungary";
				category = "Information";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} else if(mode.contentEquals("hungarymarket")) {
				country = "Hungary";
				category = "Market";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);				
			} else if(mode.contentEquals("hungarytogether")) {
				country = "Hungary";
				category = "Together";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} 
			
			//czech
			else if(mode.contentEquals("czechinfo")) {
				country = "Czech";
				category = "Information";	
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} else if(mode.contentEquals("czechmarket")) {
				country = "Czech";
				category = "Market";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);				
			} else if(mode.contentEquals("czechtogether")) {
				country = "Czech";
				category = "Together";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} 
			
			//germany
			else if(mode.contentEquals("germanyinfo")) {
				category = "Information";
				country = "Germany";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} else if(mode.contentEquals("germanymarket")) {
				country = "Germany";
				category = "Market";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);				
			} else if(mode.contentEquals("germanytogether")) {
				country = "Germany";
				category = "Together";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} 
			
			//swiss
			else if(mode.contentEquals("swissinfo")) {
				category = "Information";
				country = "Swiss";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} else if(mode.contentEquals("swissmarket")) {
				category = "Market";
				country = "Swiss";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);				
			} else if(mode.contentEquals("swisstogether")) {
				country = "Swiss";
				category = "Together";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} 
			
			//italy
			else if(mode.contentEquals("italyinfo")) {
				country = "Italy";
				category = "Information";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} else if(mode.contentEquals("italymarket")) {
				country = "Italy";
				category = "Market";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);				
			} else if(mode.contentEquals("italytogether")) {
				country = "Italy";
				category = "Together";
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category, country);
				request.setAttribute("rList", rList);
			} 
			
			//search
			else if(mode.contentEquals("titleselect")) {
				List<ReviewElementBean> rList = dao.titleselect(conn, title);
				request.setAttribute("rList", rList);
				request.setAttribute("mode", mode);
			} else if(mode.contentEquals("writerselect")) {
				List<ReviewElementBean> rList = dao.writerselect(conn, name);
				request.setAttribute("rList", rList);
				request.setAttribute("mode", mode);
			}
		} catch(SQLException e){
			throw new ServiceException("ListReviewAction Error " + e.getMessage());
		} finally {
			try {
				if(conn!=null) conn.close();
			} catch(SQLException se){
				se.printStackTrace();
			}
		}
	}
}
