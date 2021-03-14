package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.entity.Employee;
import co.edureka.service.EmployeeService;

@WebServlet("/searchemp")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ApplicationContext context = null;
	
	private EmployeeService empService;
	
	public void init(ServletConfig config) {
		context = new ClassPathXmlApplicationContext("context.xml");
		empService = (EmployeeService) context.getBean("empservice");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eno = Integer.parseInt(request.getParameter("eno"));
		Employee emp = empService.findEmployeeById(eno);
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		if(emp != null) {
			JSONObject jobj = new JSONObject();
			jobj.put("name", emp.getEname());
			jobj.put("sal", emp.getSal());
			out.println(jobj);
		}else {
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
