package links;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String value = request.getParameter("li");
		
		if(value.equals("google")) {
			//out.println("addition operation by servlet 1");
			response.sendRedirect("https://www.google.com/search?q=google&rlz=1C1CHBF_enIN814IN814&oq=google&aqs=chrome..69i57j69i59j69i60l3j69i65l3.1253j0j4&sourceid=chrome&ie=UTF-8");
		}
		else if(value.equals("gmail")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.google.com/search?q=gmail&rlz=1C1CHBF_enIN814IN814&oq=gmail&aqs=chrome..69i57j0l5j69i61j69i65.2061j0j9&sourceid=chrome&ie=UTF-8");
		}
		else if(value.equals("w3schools")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.w3schools.com/");
		}
		else if(value.equals("html tutorial")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.w3schools.com/html/default.asp")
		}
		else if(value.equals("javascript tutorial")) {
			//response.sendRedirect("Servlet2");
			response.sendRedirect("https://www.w3schools.com/js/default.asp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
