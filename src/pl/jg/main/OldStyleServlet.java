package pl.jg.main;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OldStyleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        //Presentation logic in servlet - that's not a good idea...

        PrintWriter out = response.getWriter();
        out.println("<html><h1 align=center>Hej ho, hej ho, do pracy by sie szlo!</h1></html>");

    }
}
