package controllers.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import entity.core.Product;
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
	 
	 private final ObjectMapper mapper;
	 
	 public ApiProductServlet() {
		 this.service=ProductService.getInstance();
		 this.mapper=new ObjectMapper();
		 }

	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	        req.setCharacterEncoding("UTF-8");
	        resp.setContentType("application/json");
	        List<Product> products=this.service.get();
	        PrintWriter writer = resp.getWriter();
	        writer.write(this.mapper.writeValueAsString(products));
	        
	    }
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
			req.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			ProductCreateDTO createDTO2 = this.mapper.readValue(req.getInputStream(), ProductCreateDTO.class);
			
//			ProductCreateDTO createDTO = new ProductCreateDTO();
//			createDTO.setTitle(req.getParameter("title"));
//			createDTO.setPrice(Double.parseDouble(req.getParameter("price")));
//			createDTO.setDiscount(Double.parseDouble(req.getParameter("discount")));
//			createDTO.setDescription(req.getParameter("description"));
			this.service.save(createDTO2);
			resp.setStatus(201);
		}
}
