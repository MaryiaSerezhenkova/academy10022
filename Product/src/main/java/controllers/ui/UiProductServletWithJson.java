package controllers.ui;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.dto.ProductFromJson2;
import services.ProductService;
import services.api.IProductService;
 
/**
 * Servlet implementation class UiProductServletWithJson
 */
@WebServlet("/UiProductWithJson")
public class UiProductServletWithJson extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private IProductService service;
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UiProductServletWithJson() {
        this.service = ProductService.getInstance();
    }
 
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("application/json");
            resp.setCharacterEncoding("UTF-8");
            try {
                resp.getWriter().write(ProductFromJson2.toJson(service.get()));
            } catch (Exception e) {
                resp.setStatus(500);
            }
            resp.setStatus(200);
        }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //doGet(request, response);
    }
 
}
 