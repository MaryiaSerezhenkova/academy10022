package controllers.api;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.dto.ProductFromJson2;
import services.ProductService;
import services.api.IProductService;

/**
 * Servlet implementation class ApiProductWithJson
 */
@WebServlet("/ApiProductWithJson")
public class ApiProductWithJson extends HttpServlet {
	public class ApiProductWithJSON extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	 
	    private IProductService service;
	    
	    public ApiProductWithJSON() {
	        this.service = ProductService.getInstance();
	    }
	 
	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	    }
	 
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	        req.setCharacterEncoding("UTF-8");
	        resp.setContentType("application/json");
	        String jsonString = req.getReader().lines().collect(Collectors.joining());
	        this.service.save(ProductFromJson2.fromJson(jsonString));
	        resp.setStatus(201);
	    }
	 
	}
}