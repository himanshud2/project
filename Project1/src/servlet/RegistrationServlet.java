package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import p1.Student;
import utility.DaoOperations;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		int age=Integer.parseInt((request.getParameter("age")));
		Student student=new Student(name,id,age,password);
		DaoOperations daoOperations=new DaoOperations();
		if(daoOperations.register(student)){
			printWriter.println("Registered");
			printWriter.println("<a href='login.jsp'>Login</a>");
		}
		else{
			printWriter.print("Not Registered");
			printWriter.println("<a href='register.jsp'>Register Again</a>");
		}
	}

}
