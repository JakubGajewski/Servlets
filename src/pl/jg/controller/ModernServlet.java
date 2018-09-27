package pl.jg.controller;

import pl.jg.model.DateService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ModernServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        DateService dateService = new DateService();

        String now = dateService.getDate();

        request.setAttribute("now", now);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
    }
}
