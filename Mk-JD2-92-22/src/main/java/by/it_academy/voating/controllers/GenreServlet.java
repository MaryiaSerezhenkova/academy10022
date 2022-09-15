package by.it_academy.voating.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.it_academy.voating.core.entity.Genre;
import by.it_academy.voating.services.GenreService;
import by.it_academy.voating.services.api.IGenreService;

/**
 * Servlet implementation class GenreServlet
 */
@WebServlet("/GenreServlet")
public class GenreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IGenreService service = GenreService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GenreServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter writer = response.getWriter();

		List<Genre> data = service.get();

		for (Genre item : data) {
			writer.write(item.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
