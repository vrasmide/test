package webapp;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException {
		
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>First Program</title>");
		out.println("<head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.print("</body>");
		out.println("</html>");
		
		
	}
}
