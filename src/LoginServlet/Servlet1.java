package LoginServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PrintWriter.*;
import java.io.PrintWriter;
import java.io.PrintWriter;
import javax.jws.WebService;

@WebSerlet()
public class Servlet1 extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletEXception,IOException
	{
		response.setContentType("text/html");
		printWriter writer=response.getWriter();
		String upwd=request.getParameter("upwd");
		if(upwd.equals("ratan")){
		RequestDispatcher rd=request.getRequestDispatcher("success");
		rd.forward(request, response);
		}
		else{
			writer.print("oops ! Sorry username or password error! try once again !");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			}
		
	}

}


/*
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet1 extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {response.setContentType("text/html");
PrintWriter writer = response.getWriter();
String upwd=request.getParameter("upwd");
if(upwd.equals("ratan")){
RequestDispatcher rd=request.getRequestDispatcher("success");
rd.forward(request, response);
}
else{
writer.print("oops ! Sorry username or password error! try once again !");
RequestDispatcher rd=request.getRequestDispatcher("login.html");
rd.include(request, response);
}
}
}*/