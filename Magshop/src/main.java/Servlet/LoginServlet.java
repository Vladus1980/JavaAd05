package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.UserService;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_email = request.getParameter("user_email");
		String password = request.getParameter("user_pass");
		
//		UserService userService = UserService.getUserService();
//		User user = userService.getUser(user_email);
//		
//		
//		if (user == null) {
//			request.getRequestDispatcher("login.jsp");
//		}
//		
//		if (user.getUser_pass().equals(password)) {
//			
//		
//		request.setAttribute("userUser_email", user_email);
//		request.getRequestDispatcher("cabinet.jsp");
//		}
//		request.getRequestDispatcher("login.jsp");
//	}
	}
}