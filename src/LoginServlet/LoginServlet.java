package LoginServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter writer = response.getWriter();
	String uname = request.getParameter("uname");
	String upwd = request.getParameter("upwd");
	if(uname.equals("durga")&&upwd.equals("ratan"))
	{
	writer.println("Login Success...."+uname);
	}
	else
	{
	writer.println("Login Fail try with valid credentials");
	}
	}
}
/*publicclass LoginServlet extends HttpServlet {
protectedvoid doGet(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
response.setContentType("text/html");
PrintWriter writer = response.getWriter();
String uname = request.getParameter("uname");
String upwd = request.getParameter("upwd");
if(uname.equals("durga")&&upwd.equals("ratan"))
{
writer.println("Login Success...."+uname);
}
else
{
writer.println("Login Fail try with valid credentials");
}
}
}*/