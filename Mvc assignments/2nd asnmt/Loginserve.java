

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvpack1.Loginbean;

/**
 * Servlet implementation class Loginserve
 */
public class Loginserve extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		Loginbean b1=new Loginbean();
		
		if(b1.validate(name, password))
		{
			request.setAttribute("logname", name);
		
		RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
		rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp");
		rd.forward(request, response);
		}
		
	}

}
