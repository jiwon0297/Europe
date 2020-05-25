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
			String country = request.getParameter("country");
			String category = request.getParameter("category");
			conn = ConnectionProvider.getConnection();
			ReviewTableDAO dao = ReviewTableDAO.getInstance();
			if (mode.contentEquals("listbycategory")) {
				List<ReviewElementBean> rList = dao.selectListByCategory(conn, category);
				request.setAttribute("rList", rList);
				request.setAttribute("category", category);
			} else if(mode.contentEquals("listbycountry")) {
				List<ReviewElementBean> rList = dao.selectListByCountry(conn, country);
				request.setAttribute("rList", rList);
				request.setAttribute("country", country);
				
			} else {
				List<ReviewElementBean> rList = dao.selectList(conn);
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
