package by.it_academy.voating.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.it_academy.voating.core.entity.Artist;
import by.it_academy.voating.core.entity.Genre;
import by.it_academy.voating.services.ArtistService;
import by.it_academy.voating.services.GenreService;
import by.it_academy.voating.services.api.IArtistService;
import by.it_academy.voating.services.api.IGenreService;

/**
 * Servlet implementation class VoteServlet
 */
@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<String> artist = new ArrayList<>();
	private List<String[]> genre = new ArrayList<>();
	private List<String> about = new ArrayList<>();
	private IArtistService artistService = ArtistService.getInstance();
	private IGenreService genreService = GenreService.getInstance();


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VoteServlet() {
		super();
		// TODO Auto-generated constructor stub
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
		List <Artist> artists = artistService.get();
		List <Genre> genres = genreService.get();
		request.setAttribute("artists", artists);
		request.setAttribute("genres", genres);
		request.getRequestDispatcher("/view/main.jsp").forward(request, response);
//		 String html = "<!DOCTYPE html>\n" +
//	                "<html>\n" +
//	                "\t<head>\n" +
//	                "\t\t<meta charset=\"utf-8\">\n" +
//	                "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
//	                "\t\t<title>Форма голосования</title>\n" +
//	                "\t</head>\n" +
//	                "\t<body>\n" +
//	                "\t\t<form method=\"POST\">\n" +
//	                "\t\t\t<div>\n" +
//	                "\t\t\t\t<label>Лучший исполнитель</label>\n" +
//	                "\t\t\t\t<select name=\"artist\">\n";
//
//	        for (Artist item : artists) {
//	            html += "\t\t\t\t\t<option value=\"" + item.getId() + "\">" + item.getName() + "</option>\n";
//	        }
//
//	        html += "\t\t\t\t</select>\n" +
//	                "\t\t\t</div>\n" +
//	                "\t\t\t<div>\n" +
//	                "\t\t\t\t<label>Любимый жанр</label>\n" +
//	                "\t\t\t\t<select multiple name=\"genre\">\n";
//	                for (Genre item : genres) {
//	    	            html += "\t\t\t\t\t<option value=\"" + item.getId() + "\">" + item.getTitle() + "</option>\n";
//	    	        }
//	                html +="\t\t\t\t</select>\n" +
//	                "\t\t\t</div>\n" +
//	                "\t\t\t<div>\n" +
//	                "\t\t\t\t<label>О себе</label>\n" +
//	                "\t\t\t\t<textarea name=\"about\"></textarea>\n" +
//	                "\t\t\t</div>\n" +
//	                "\t\t\t<input type=\"submit\">\n" +
//	                "\t\t</form>\n" +
//	                "\t</body>\n" +
//	                "</html>";
//
//	        writer.write(html);
	}

	public List<String> getArtist() {
		return artist;
	}

	public void setArtist(List<String> artist) {
		this.artist = artist;
	}

	public List<String[]> getGenre() {
		return genre;
	}

	public void setGenre(List<String[]> genre) {
		this.genre = genre;
	}

	public List<String> getAbout() {
		return about;
	}

	public void setAbout(List<String> about) {
		this.about = about;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//System.out.println("работает");
		artist.add(request.getParameter("artist"));
		genre.add(request.getParameterValues("genre"));
		about.add(request.getParameter("about"));
//		PrintWriter writer = response.getWriter();
//		writer.write("<div>");
//		writer.write("<p>Артисты</p>");
//		artist.forEach(a-> writer.write("<p>"+ a+"</p>"));
//		writer.write("</div>");
//		writer.write("<div>");
//		writer.write("<p>Жанры</p>");
//		genre.forEach(g-> writer.write("<p>"+String.join(",", g)+"</p>"));
//		writer.write("</div>");
//		writer.write("<div>");
//		writer.write("<p>О себе</p>");
//		about.forEach(a-> writer.write("<p>"+ a+"</p>"));
//		writer.write("</div>");
//		

	}

}
