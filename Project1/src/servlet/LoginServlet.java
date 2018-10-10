package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.DaoOperations;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		DaoOperations daoOperations=new DaoOperations();
		if(daoOperations.login(name, password)){
			printWriter.println("Logged Succefully");
		}
		else{
			printWriter.print("Invalid Username or Password");
		}
	}

}
