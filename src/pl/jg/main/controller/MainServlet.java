package pl.jg.main.controller;

import pl.jg.main.model.DateService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        RequestDispatcher view;

        int mod = Integer.valueOf(request.getParameter("module"));
        view = request.getRequestDispatcher("menu.jsp");
        switch (mod) {
            case 1:
                view = request.getRequestDispatcher("maths_index.jsp");
                break;
            case 2:
                view = request.getRequestDispatcher("menu.jsp");
                break;
        }

        view.forward(request, response);
    }
}
