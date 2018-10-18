package pl.jg.maths.controller;

import pl.jg.maths.model.MathsService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MathsServlet extends HttpServlet {
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String content = request.getParameter("content");

        String selectedPage;

        if (content.equals("one")) {
            selectedPage = "menu.jsp";
        }


        RequestDispatcher view = request.getRequestDispatcher(content);

        view.forward(request, response);
    }

    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MathsService mathsService = new MathsService();
        String action =  request.getParameter("action");
        double number = Double.parseDouble(request.getParameter("number"));
        double result = 0;

        if (action.equals("addition")) {
            result = mathsService.randomAddition(number);
        } else if (action.equals("subtraction")) {
            result = mathsService.randomSubtraction(number);
        }

        request.setAttribute("result", result);
        request.setAttribute("number", number);
        request.setAttribute("action", action);

        RequestDispatcher view = request.getRequestDispatcher("maths_index.jsp");

        view.forward(request, response);
    }
}
