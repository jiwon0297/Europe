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
import action.AddPeriodicElementAction;
import action.DeletePeriodicElementAction;
import action.EditPeriodicElementAction;
import action.FindPeriodicElementAction;
import action.ListPeriodicElementAction;
import action.LoginAction;
import action.MemberAction;

@WebServlet("/PeriodicTableController")
public class PeriodicTableController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PeriodicTableController() {
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
		if (command.equals("/ListViewAction.do")) {
			action = new ListPeriodicElementAction();
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("listView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/DetailViewAction.do")) {
			action = new FindPeriodicElementAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("detailView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/AddviewAction.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("addView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/EditViewAction.do")) {
			action = new FindPeriodicElementAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("editView.jsp");
			rd.forward(request, response);
		} else if (command.equals("/AddAction.do")) {
			action = new AddPeriodicElementAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/ListViewAction.do");
			rd.forward(request, response);
		} else if (command.equals("/EditAction.do")) {
			action = new EditPeriodicElementAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/ListViewAction.do?mode=edit");
			rd.forward(request, response);
		} else if (command.equals("/DeleteAction.do")) {
			action = new DeletePeriodicElementAction();
			action.execute(request,response);
			RequestDispatcher rd = request.getRequestDispatcher("/ListViewAction.do?mode=delete");
			rd.forward(request, response);
		} else if (command.equals("/LoginAction.do")) {
			action = new LoginAction("login");
			action.execute(request, response);
			HttpSession session = request.getSession(true);
			int member = (int)session.getAttribute("member");
			if (member == 1) {
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("loginfail.jsp");
				rd.forward(request, response);
			}
		} else if (command.equals("/LogoutAction.do")) {
			action = new LoginAction("logout");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} else if (command.equals("/JoinMemberAction.do")) {
			action = new MemberAction("join");
			action.execute(request, response);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}
