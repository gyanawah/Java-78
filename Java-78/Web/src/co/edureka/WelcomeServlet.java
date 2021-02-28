package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		
		out.println("<body style=background-color:lightgreen;text-align:center>");
		out.println("<h2>edureka limited</h2>");
		out.println("<img src=images/edureka2.jpg width=150px>");
		out.println("<hr color=blue size=3>");
		out.println("<p style=text-align:left;font-size:17px>Hi, "+request.getParameter("txtUid")+"</p>");
		out.println("<hr color=blue size=3>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
