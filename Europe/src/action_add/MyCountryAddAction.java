package action_add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.LocationTableDAO;
import dto.LocationElementBean;

public class MyCountryAddAction implements Action{
	@Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        
		LocationTableDAO dao = LocationTableDAO.getInstance();
		LocationElementBean location = new LocationElementBean();
        
        // 파리미터 값을 가져온다.
        int countryNumber = Integer.parseInt(request.getParameter("countryNumber"));
        String location1 = request.getParameter("location");
       
        location.setCountryNumber(countryNumber);
        location.setLocation(location1);
        
        boolean result = dao.insertLocation(location);
        
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
