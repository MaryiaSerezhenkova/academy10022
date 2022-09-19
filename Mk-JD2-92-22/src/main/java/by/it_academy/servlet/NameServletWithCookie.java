package by.it_academy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NameServletWithCookie
 */
@WebServlet("/NameServletWithCookie")
public class NameServletWithCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Cookie myCookie = new Cookie("firstName", firstName);
		myCookie.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toMinutes(5)));
		response.addCookie(myCookie);
		Cookie myCookie2 = new Cookie("lastName", lastName);
		myCookie.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toMinutes(5)));
		response.addCookie(myCookie2);
		if (firstName == null) {
			firstName = myCookie.toString();
			if (myCookie == null) {
				throw new IllegalArgumentException("Вы не заполнили имя");
			}

		}
		PrintWriter writer = response.getWriter();
		writer.write("<p><span style='color: blue;'>Hello, " + firstName + " " + lastName + "</span></p>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	}
}
