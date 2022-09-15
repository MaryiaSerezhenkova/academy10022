package by.it_academy.voating.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.it_academy.voating.core.entity.Artist;
import by.it_academy.voating.services.ArtistService;
import by.it_academy.voating.services.api.IArtistService;

/**
 * Servlet implementation class ArtistServlet
 */
@WebServlet("/ArtistServlet")
public class ArtistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IArtistService service = ArtistService.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ArtistServlet() {
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
		List<Artist> data = service.get();
		for (Artist item : data) {
			writer.write(item.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
