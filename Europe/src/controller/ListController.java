package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import action.Action;
import action.LoginAction;
import action_list.ListMarketAction;


@WebServlet("/ListController")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html, charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		Action action = null;
		if (command.equals("/MarketListViewAction.do")) {
			action = new ListMarketAction("list");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("marketListView.jsp");
			rd.forward(request, response);
		} else if(command.equals("/MarketListByCategory.do")) {
			action = new ListMarketAction("listbycategory");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("marketListView.jsp?mode=category");
			rd.forward(request, response);
		} else if(command.equals("/MarketListByCountry.do")) {
			action = new ListMarketAction("listbycountry");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("marketListView.jsp?mode=country");
			rd.forward(request, response);
		} 
	}

}
