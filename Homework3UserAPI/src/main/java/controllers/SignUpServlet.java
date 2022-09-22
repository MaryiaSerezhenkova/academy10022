package controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.core.UserBuilder;
import services.UserService;
import services.api.IUserService;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/user/api")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final IUserService userService = UserService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Hello");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		// getServletContext().getRequestDispatcher("/jsp/SignUpPage.jsp");
		resp.sendRedirect("/jsp/SignUpPage.jsp");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		String login = req.getParameter("login");
		String password = req.getParameter("password");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String birthDate = req.getParameter("birthDate");

		Calendar calendar = Calendar.getInstance();// LocalDate
		StringBuilder errors = new StringBuilder();
		
		if (login == null || login.isBlank()) {
			errors.append("Login is empty");
		}

		if (password == null || password.isBlank()) {
			errors.append("Password is empty");
		}

		if (firstName == null || firstName.isBlank()) {
			errors.append("First name is empty");
		}

		if (lastName == null || lastName.isBlank()) {
			errors.append("Last name is empty");
		}

		if (birthDate == null) {
			errors.append("Birth date is empty");
		}
		if (errors==null) {
			userService.save(UserBuilder.create().setLogin(login).setPassword(password).setFirstName(firstName)
					.setLastName(lastName).setBirthDate(calendar).build());
			resp.sendRedirect("/jsp/SignInPage.jsp");
		}

	}

}
