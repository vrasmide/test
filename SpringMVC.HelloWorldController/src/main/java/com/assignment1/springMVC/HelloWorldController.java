package com.assignment1.springMVC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("url-patterns=/hello")
public class HelloWorldController extends HttpServlet
{
	protected void doGet(HttpServletRequest request,HttpServletResponse response ) 
			throws IOException, ServletException {
		response.setContentType("text/html");
		request.getRequestDispatcher("/WEB-INF/views/helloworld.jsp").forward(request,response);
		//PrintWriter out=response.getWriter();
		//out.print("<html>");
		//out.print("<body>Helloworld controller</body>");
		//out.print("</html>");
		
	}

}
