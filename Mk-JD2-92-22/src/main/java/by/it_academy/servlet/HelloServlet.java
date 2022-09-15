package by.it_academy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello_with_name")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		PrintWriter writer = resp.getWriter();
		writer.write("<p><span style='color: blue;'>Hello, " + firstName + " " + lastName + "</span></p>");

	}
}
