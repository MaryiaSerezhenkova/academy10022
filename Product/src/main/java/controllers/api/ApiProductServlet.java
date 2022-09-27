package controllers.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.dto.ProductCreateDTO;
import services.ProductService;
import services.api.IProductService;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/api/product")
public class ApiProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private IProductService service;
	 
	 public ApiProductServlet() {
		 this.service=ProductService.getInstance();
		 }

	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//	        req.setCharacterEncoding("UTF-8");
//	        resp.setContentType("text/html; charset=UTF-8");
//	        req.setAttribute("productData", productService.get());
//	        RequestDispatcher form = req.getRequestDispatcher("/view/ProductForm.jsp");
//	        form.forward(req, resp);
	    }
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
			req.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			ProductCreateDTO createDTO = new ProductCreateDTO();
			createDTO.setTitle(req.getParameter("title"));
			createDTO.setPrice(Double.parseDouble(req.getParameter("price")));
			createDTO.setDiscount(Double.parseDouble(req.getParameter("discount")));
			createDTO.setDescription(req.getParameter("description"));
			this.service.save(createDTO);
			resp.setStatus(201);
		}
}
