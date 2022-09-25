package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entity.core.User;
import entity.core.dto.MessageCreateDTO;
import services.MessageService;
import services.api.IMessageService;

/**
 * Servlet implementation class MessageServlet
 */
@WebServlet(name = "ApiMessageServlet", urlPatterns = "/api/message")
public class ApiMessageServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final IMessageService messageService;

    public ApiMessageServlet() {
        this.messageService = MessageService.getInstance();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        User user = (User) session.getAttribute("user");

        if(user == null){
            throw new SecurityException("Ошибка безопасности");
        }

        String recipient = req.getParameter("recipient");
        String text = req.getParameter("text");

        MessageCreateDTO message = new MessageCreateDTO();
        message.setSender(user.getLogin());
        message.setRecipient(recipient);
        message.setText(text);

        try{
            this.messageService.addMessage(message);
            req.setAttribute("success", true);
        } catch (IllegalArgumentException e){
            req.setAttribute("error", true);
            req.setAttribute("message",  e.getMessage());
        }
        req.getRequestDispatcher("/jsp/Message.jsp").forward(req, resp);
    }
}
