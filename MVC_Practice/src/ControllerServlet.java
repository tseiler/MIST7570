

import helpers.StringReverser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet which dispatches requests to the hello servlet, reverse.jsp, 
 * or back to the index.jsp page.
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Dispatches requests to the Hello Servlet if the userName parameter is present,
	 * to the reverse jsp page if the userName is present in the session and the originalString
	 * parameter is present, and back to the index page if the userName is not present as a 
	 * parameter or session variable.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = this.getServletContext();
		HttpSession session = request.getSession();
		
		System.out.println("User name parameter: " + request.getParameter("userName") );
		System.out.println("User name from Session:  " + session.getAttribute("userName") );
		if( request.getParameter("userName") != null ){
			RequestDispatcher dispatcher = ctx.getRequestDispatcher("/Hello");
			dispatcher.forward(request, response);
			session.setAttribute("userName", request.getParameter("userName") );
		}else if( request.getParameter("originalString") != null 
				&& session.getAttribute("userName") != null ){
			RequestDispatcher dispatcher = ctx.getRequestDispatcher("/reverse.jsp");
			String originalString = request.getParameter("originalString");
			String reversedString = StringReverser.reverseIt(originalString);
			request.setAttribute("originalString", originalString);
			request.setAttribute("reversedString", reversedString);	
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = ctx.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
