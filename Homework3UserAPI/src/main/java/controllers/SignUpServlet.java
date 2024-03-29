package controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.core.UserBuilder;
import services.UserService;
import services.api.IUserService;

@WebServlet(name = "SignUpServlet", urlPatterns = "/api/user")
public class SignUpServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final IUserService userService = UserService.getInstance();

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		resp.sendRedirect(getServletContext().getContextPath() + "/jsp/SignUpPage.jsp");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		String login = req.getParameter("login");
		String password = req.getParameter("password");
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String birthDate = req.getParameter("birthDate");

		List<String> errors = new ArrayList<String>();

		if (login == null || login.isBlank()) {
			errors.add("Login is empty");
		}

		if (password == null || password.isBlank()) {
			errors.add("Password is empty");
		}

		if (firstName == null || firstName.isBlank()) {
			errors.add("First name is empty");
		}

		if (lastName == null || lastName.isBlank()) {
			errors.add("Last name is empty");
		}

		if (birthDate == null || birthDate.isBlank()) {
			errors.add("Birth date is empty");
		}

		if (errors.isEmpty()) {
			LocalDate localDate = LocalDate.parse(birthDate);

			userService.save(UserBuilder.create().setLogin(login).setPassword(password).setFirstName(firstName)
					.setLastName(lastName).setDateOfBirth(localDate).build());
			resp.sendRedirect(getServletContext().getContextPath() + "/jsp/SignInPage.jsp");
		} else {
			req.setAttribute("errorMessages", errors);
			req.getRequestDispatcher("/jsp/SignUpPage.jsp").include(req, resp);
		}
	}

}