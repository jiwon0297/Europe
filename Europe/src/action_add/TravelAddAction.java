package action_add;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action2;
import action.ActionForward;
import dao.TravelTableDAO;
import dto.TravelElementBean;

public class TravelAddAction implements Action2 {
	@Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
		TravelTableDAO dao = TravelTableDAO.getInstance();
		TravelElementBean travel = new TravelElementBean();
        
        // �ĸ����� ���� �����´�.
        String userId = request.getParameter("userId");
        String country = request.getParameter("country"); 
        int nights = Integer.parseInt(request.getParameter("nights"));
        int days = Integer.parseInt(request.getParameter("days"));
        String startDate = request.getParameter("startDate");
        travel.setUserId(userId);
        travel.setCountry(country);
        travel.setNights(nights);
        travel.setDays(days);
        travel.setStartDate(startDate);
        
        boolean result = dao.insertTravel(travel);
 
        if(result){
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.println("1");
            out.close();
        }
            
        return null;
    }

}
