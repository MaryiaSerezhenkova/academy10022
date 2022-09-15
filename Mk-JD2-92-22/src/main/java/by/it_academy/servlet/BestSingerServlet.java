package by.it_academy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BestSingerServlet
 */
@WebServlet("/BestSingerServlet")
public class BestSingerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<String> artists = List.of("Madonna", "Dua Lipa", "Billie Eilish", "Taylor Swift");
	List<String> genres = List.of("Classical", "Jazz", "Hip-Hop", "Electronic", "Rock", "Disco", "Fusion", "Pop",
			"Country", "Blues");

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BestSingerServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();
		fillForm(artists, genres, writer);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String info = request.getParameter("artist");
		String info2 = request.getParameter("genres");
		HashMap<String, Integer> bestSinger = new HashMap<>();
		HashMap<String, Integer> bestGenre = new HashMap<>();
//		sortedMap(bestSinger, artists, info);
//		sortedMap(bestGenre, genres, info2);
		System.out.println("работает");
	}

	public void fillForm(List<String> l1, List<String> l2, PrintWriter s) {
		PrintWriter writer = s;
		writer.write("<form action='/Mk-JD2-92-22/BestSingerServlet' method='POST'>");
		writer.write("<div>");
		writer.write("<label for='artist'>Artists:</label>");
		writer.write("<select id='artist' name='artist'>");
		for (int i = 0; i < l1.size(); i++) {
			writer.write("<option value=" + l1.get(i) + ">" + l1.get(i) + "</option>");
		}
		writer.write("</select>");
		writer.write("</div>");
		writer.write("<div>");
		for (int i = 0; i < l2.size(); i++) {
			writer.write("<input type='checkbox' name='genres' value=" + l2.get(i) + "/>" + l2.get(i));
		}
		writer.write("</div>");
		writer.write("<div>");
		writer.write("<textarea id='aboutMe' name='aboutMe' rows='3'></textarea>");
		writer.write("</div>");
		writer.write("<button type='submit'>save</button>");
		writer.write("</form>");
	}

	public void sortedMap(HashMap<String, Integer> hp, List<String> l1, String s) {
		for (int i = 0; i < l1.size(); i++) {
			hp.put(l1.get(i), 0);
			if (s.equals(hp.containsKey(l1.get(i)))) {
				hp.put(l1.get(i), hp.get(l1.get(i)) + 1);
			}
			hp.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
					.forEach(System.out::println);

		}
	}
}