package action_list;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import action.NotFoundException;
import action.ServiceException;
import dao.LocationTableDAO;
import dto.LocationElementBean;
import jdbc.ConnectionProvider;

public class ListLocationAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Connection conn = null;
		try {
			HttpSession session = request.getSession(true);
			int number = Integer.parseUnsignedInt((String)session.getAttribute("number"));

			conn = ConnectionProvider.getConnection();
						
			// �Խñ� ��ȣ�� �̿��Ͽ� �ش� �ۿ� �ִ� ��� ����� �����´�.
			LocationTableDAO locationtableDAO = LocationTableDAO.getInstance();
	        ArrayList<LocationElementBean> lList = locationtableDAO.getLocationList(number);
	        
	        // ����� 1���� �ִٸ� request�� commentList�� �����Ѵ�.
	        if(lList.size() > 0)    request.setAttribute("lList", lList);
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
