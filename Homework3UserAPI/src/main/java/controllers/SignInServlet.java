package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.core.User;
import services.UserService;
import services.api.IUserService;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/api/login")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final IUserService userService = UserService.getInstance();

	@Override
	public void init() throws ServletException {
		super.init();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		resp.sendRedirect(getServletContext().getContextPath() + "/jsp/SignInPage.jsp");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		String login = req.getParameter("login");
		String password = req.getParameter("password");

		List<String> errors = new ArrayList<String>();

		if (login == null || login.isBlank()) {
			errors.add("Login is empty");
		}

		if (password == null || password.isBlank()) {
			errors.add("Password is empty");
		}

		// VALIDATION
		if (userService.getUserByLoginPassword(login, password) == null) {
			errors.add("Login or password not valid.");
		}

		if (errors.isEmpty()) {
			User user = userService.getUserByLoginPassword(login, password);
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			resp.sendRedirect(getServletContext().getContextPath() + "/jsp/WelcomeUser.jsp");
		} else {
			req.setAttribute("errorMessages", errors);
			req.getRequestDispatcher("/jsp/SignInPage.jsp").include(req, resp);
		}
	}

}