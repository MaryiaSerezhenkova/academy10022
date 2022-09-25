package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.ProductService;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private final ProductService productService = ProductService.getInstance();

	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	        req.setCharacterEncoding("UTF-8");
	        resp.setContentType("text/html; charset=UTF-8");
	        req.setAttribute("productData", productService.get());
	        RequestDispatcher form = req.getRequestDispatcher("/view/ProductForm.jsp");
	        form.forward(req, resp);
	    }
}
