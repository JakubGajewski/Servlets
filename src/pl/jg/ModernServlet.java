package pl.jg;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ModernServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        PrintWriter out = response.getWriter();
        out.println("<html><h1 align=center>Hej ho, hej ho, do pracy by sie szlo! Dzisiaj jest: " + new Date() +"</h1></html>");

    }

}
