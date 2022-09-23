package by.it_academy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookies")
public class ReadCookies extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie cookie = null;
		Cookie[] cookies = null;

		// Get an array of Cookies associated with this domain
		cookies = request.getCookies();

		// Set response content type
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		if (cookies != null) {
			out.println("<h2> Found Cookies Name and Value</h2>");

			for (int i = 0; i < cookies.length; i++) {
				cookie = cookies[i];
				out.print("Name : " + cookie.getName() + ",  ");
				out.print("Value: " + cookie.getValue() + " <br/>");
			}
		} else {
			out.println("<h2>No cookies founds</h2>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}