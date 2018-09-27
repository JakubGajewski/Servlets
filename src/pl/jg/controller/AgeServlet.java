package pl.jg.controller;

import pl.jg.model.AgeOfConsent;
import pl.jg.model.DateService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AgeServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        AgeOfConsent ageOfConsent = new AgeOfConsent();

        int age = Integer.valueOf(request.getParameter("age"));


        //int age = 15;

        if (ageOfConsent.checkAge(age)) {
            RequestDispatcher view = request.getRequestDispatcher("sayHello.jsp");
            view.forward(request, response);
        } else {
            RequestDispatcher view = request.getRequestDispatcher("sayGoodbye.jsp");
            view.forward(request, response);
        }
    }
}
