package Servlet;

import domain.User_level;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("register.jsp").forward(request, response);
	}

 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 	String user_firstname = request.getParameter("user_firstname");
	 	String user_lastname = request.getParameter("user_lastname");
	 	String user_email = request.getParameter("user_email");
	 	String user_pass = request.getParameter("user_pass");
	 	String user_level = null;
	 	
	 	if ("user".equals(request.getParameter("user_level"))) {
			user_level = User_level.USER.toString();
		} else if ("admin".equals(request.getParameter("user_level"))){
			user_level = User_level.ADMIN.toString();
		}
	 	
//	 	try {
//			userService.saveUser(new User(user_firstname, user_lastname, user_email, user_pass, user_level));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		HttpSession session = request.getSession(true);
		session.setAttribute("userUser_email", user_email);
		
	 	request.getRequestDispatcher("cabinet.jsp").forward(request, response);
	 	
	} 

}
