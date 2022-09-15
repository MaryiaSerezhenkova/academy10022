package by.it_academy.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletDynamicName extends HttpServlet {

		private static final long serialVersionUID = 1L;

		@Override

		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=UTF-8");
			Enumeration<String> paramsName = req.getParameterNames();
//			if(paramsName.contains("name")) {
//			writer.write("<p><span style='color: blue;'>Hello, "+ firstName + " " + lastName+ "</span></p>");
//
//		}
	}
}



