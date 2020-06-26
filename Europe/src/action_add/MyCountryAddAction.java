package action_add;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action2;
import action.ActionForward;
import dao.LocationTableDAO;
import dto.LocationElementBean;

public class MyCountryAddAction implements Action2{
	@Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
		LocationTableDAO dao = LocationTableDAO.getInstance();
		LocationElementBean location = new LocationElementBean();
        
        // 파리미터 값을 가져온다.
        int countryNumber = Integer.parseInt(request.getParameter("number"));
        String location1 = request.getParameter("location");
       
        location.setCountryNumber(countryNumber);
        location.setLocation(location1);
     
        boolean result = dao.insertLocation(location);
 
        if(result){
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.println("1");
            out.close();
        }
            
        return null;
    }

}
