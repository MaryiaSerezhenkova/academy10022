package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menu/positions")
public class MenuPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MenuPositionServlet() {
        super();
    }
//READ LIST POSITION
//    1) read list
//    2) read card need id param
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
//CREATE POSITION
	//body json
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
//UPDATE POSITION
	//need param id
	//need param version
	//body json
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPut(request, response);
	}
	//UPDATE POSITION
		//need param id
		//need param version
		
		protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doDelete(request, response);
		}

}
