package by.it_academy.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletNameServletV3 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final String NAME_PARAMETER_HEADER = "ARRAY_NAME_PARAM";

	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		Enumeration<String> paramsName = req.getParameterNames();
		PrintWriter writer = resp.getWriter();
		String contains = req.getParameter(NAME_PARAMETER_HEADER);
		while(paramsName.hasMoreElements()) {
			String paramName = paramsName.nextElement();
			if(paramName.toLowerCase().contains(contains)) {
		//writer.write("<p>"+ header + " " + lastName+ "</p>");

	}
}
}
}