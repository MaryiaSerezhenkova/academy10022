package controllers.ui;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.core.Product;
import services.ProductService;
import services.api.IProductService;

/**
 * Servlet implementation class UiProductServlet
 */
@WebServlet("/ui/product")
public class UiProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IProductService service;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UiProductServlet() {
		this.service=ProductService.getInstance();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		List<Product> products = this.service.get();

		request.setAttribute("products", products);
		request.getRequestDispatcher("/view/ProductForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
	}

}