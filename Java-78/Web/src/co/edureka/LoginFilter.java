package co.edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/welcome")
//@WebFilter("/*")
public class LoginFilter implements Filter {
	public void destroy() {	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*
		String uid = request.getParameter("txtUid");
		String pwd = request.getParameter("txtPwd");
		
		if(uid.equals("admin") && pwd.equals("123"))
			chain.doFilter(request, response); //forward the request to the requested servlet
		else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<p style=color:red;font-size:18px;text-align:center>Invalid User Name/ Password</p>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		*/
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<p style=color:red;font-size:38px;text-align:center>Site under maintenance!!!</p>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {}

}
