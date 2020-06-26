package action_delete;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action2;
import action.ActionForward;
import dao.LocationTableDAO;
import dto.LocationElementBean;

public class MyCountryDeleteAction implements Action2 {
	@Override
    public ActionForward execute(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
    
        int number = Integer.parseInt(request.getParameter("number"));
        
        LocationTableDAO dao = LocationTableDAO.getInstance();
        boolean result = dao.deleteLocation(number);
        
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
 
        // 정상적으로 댓글을 삭제했을경우 1을 전달한다.
        if(result) out.println("1");
        
        out.close();
        return null;
    }

}
