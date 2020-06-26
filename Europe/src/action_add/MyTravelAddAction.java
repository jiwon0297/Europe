package action_add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.TravelTableDAO;
import dto.TravelElementBean;

public class MyTravelAddAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		TravelTableDAO dao = TravelTableDAO.getInstance();
		TravelElementBean travel = new TravelElementBean();
        
        // 파리미터 값을 가져온다.
        String userId = request.getParameter("userid");
        String country = request.getParameter("country"); 
        int nights = Integer.parseInt(request.getParameter("nights"));
        int days = Integer.parseInt(request.getParameter("days"));
        String startDate = request.getParameter("travelDate");
        
        travel.setUserId(userId);
        travel.setCountry(country);
        travel.setNights(nights);
        travel.setDays(days);
        travel.setStartDate(startDate);
        
        boolean result = dao.insertTravel(travel);
        
        if(result){
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out;
			try {
				out = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}

}
