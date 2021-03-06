package pl.jg.main.controller;

import pl.jg.main.model.DateService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ModernServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        DateService dateService = new DateService();

        String now = dateService.getDate();

        request.setAttribute("now", now);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");

        view.forward(request, response);

    }
}
