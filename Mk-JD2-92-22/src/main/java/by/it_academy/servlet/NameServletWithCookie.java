package by.it_academy.servlet;
//Написать сервлет, который принимает 2 параметра firstName, lastName. Если параметр передали, записать его в cookie.
//Если не передали, то читать из cookie.Выдать ошибку, если параметров нет ни в параметрах, ни в cookie
import java.io.IOException;
import java.io.PrintWriter;

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
//        Cookie myCookie = new Cookie("firstName", request.getParameter("firstName"));
//        Cookie myCookie2 = new Cookie("lastName", request.getParameter("lastName"));
// 
//        response.addCookie(myCookie);
//        response.addCookie(myCookie2);
// 
//        myCookie.setMaxAge(3600);
//        myCookie2.setMaxAge(3600);
//        Cookie[] cookies = null;
//        cookies = request.getCookies();
//        Cookie cookie = null;
//        for (int i = 0; i < cookies.length; i++) {
//            cookie = cookies[i];
//            if (firstName == null) {
// 
//                if (cookie.equals(myCookie) & cookie.getValue() != null) {
//                    firstName = cookie.getValue();}
//                } if (cookie.equals(myCookie) &cookie.getValue() == null) {
//                    throw new IllegalArgumentException("Вы не заполнили имя");
//            }
// 
//            if (lastName == null) {
// 
//                if (cookie.equals(myCookie2) & cookie.getValue() != null) {
//                    lastName = cookie.getValue();}
//                } if (cookie.equals(myCookie2) & cookie.getValue() == null) {
//                    throw new IllegalArgumentException("Вы не заполнили фамилию");
//            }
        if (firstName==null&lastName==null) {
        	if(request.getCookies()==null) {
        		//throw new Exception();
        	}
        	else {
        		for(Cookie value: request.getCookies()) {
        			if (value.getName().equals("firstName")) {
        				firstName = value.getValue();
        			}else if (value.getName().equals("lastName")) {
        				lastName = value.getValue();
        		}
        	}
        		if (firstName==null&lastName==null) {
        			
        		}
        	}
        }
        else {
        	response.addCookie(new Cookie("firstName", firstName));
        	response.addCookie(new Cookie("lastName", lastName));
        	
        	
            PrintWriter writer = response.getWriter();
            writer.write("<p><span style='color: blue;'>Hello, " + firstName + " " + lastName + "</span></p>");
        }
    }
}
 
