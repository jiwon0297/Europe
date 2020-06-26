package action_delete;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action2;
import action.ActionForward;
import dao.TravelTableDAO;
import dto.TravelElementBean;

public class TravelDeleteAction implements Action2 {
	@Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
    
        int number = Integer.parseInt(request.getParameter("number"));
        
        TravelTableDAO dao = TravelTableDAO.getInstance();
        boolean result = dao.deleteTravel(number);
        
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
 
        // ���������� ����� ����������� 1�� �����Ѵ�.
        if(result) out.println("1");
        
        out.close();
        return null;
    }

}
