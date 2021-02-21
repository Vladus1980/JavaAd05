package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dto.UserLogin;
import domain.User;
import impl.UserServiceImpl;
import service.UserService;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = UserServiceImpl.getUserService();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_email = request.getParameter("user_email");
		String user_pass = request.getParameter("user_pass");
		
		User user = userService.getUserByEmail(user_email);
		
		
		if (user != null && user.getUser_pass().equals(user_pass)) {
			UserLogin userLogin = new UserLogin();
			userLogin.destinationUrl = "cabinet.jsp";
			userLogin.userEmail = user.getUser_email();
			
			
		
		request.setAttribute("userUser_email", user_email);
		request.getRequestDispatcher("cabinet2.jsp").forward(request, response);
		}
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	
}