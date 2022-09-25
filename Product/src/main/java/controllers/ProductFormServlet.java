package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.ProductService;
import services.api.IProductService;

/**
 * Servlet implementation class ProductFormServlet
 */
@WebServlet("/ProductFormServlet")
public class ProductFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final IProductService productService = ProductService.getInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		req.setAttribute("productData", productService.get());
		RequestDispatcher form = req.getRequestDispatcher("/view/NewProductForm.jsp");
		form.forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		String title = req.getParameter("title");
		String price = req.getParameter("price");
		String discount = req.getParameter("discount");
		String description = req.getParameter("description");
		try {
			productService.add(title, Double.parseDouble(price), Double.parseDouble(discount),
					description);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		resp.sendRedirect(req.getContextPath() + "/view/ProductServlet");
	}
}