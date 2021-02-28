package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Magazine;
import impl.MagazineServiceImpl;
import service.MagazineService;


public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MagazineService magazineService = MagazineServiceImpl.getMagazineService();
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String magazine_name = request.getParameter("magazine_name");
		String magazine_pages = request.getParameter("magazine_pages");
		String magazine_price = request.getParameter("magazine_price");
		
		Magazine magazine = new Magazine(magazine_name, getValidatedPages(magazine_pages), getValidatedPrice(magazine_price));
		magazineService.create(magazine);
		response.setContentType("text");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write("Success");
	 	request.getRequestDispatcher("cabinet2.jsp").forward(request, response);
		
	}
	
	private double getValidatedPrice(String magazine_price) {
		if(magazine_price == null || magazine_price.isEmpty()) {
			return 0;
		}
		return Double.parseDouble(magazine_price);
	}
	
	private int getValidatedPages(String magazine_pages) {
		if(magazine_pages == null || magazine_pages.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(magazine_pages);
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doPut(req, resp);
	}

}
