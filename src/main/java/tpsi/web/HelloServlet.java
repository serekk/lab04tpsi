package tpsi.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})




public class HelloServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Person p1 = new Person();
        p1.firstName = request.getParameter("firstName");
        p1.lastName = request.getParameter("lastName");
        p1.email = request.getParameter("email");
        
        List<String> days = new ArrayList<>();
        days.add("Poniedziałek");
        days.add("Wtorek");
        days.add("Środa");
        days.add("Czwartek");
        days.add("Piątek");
 
        request.setAttribute("p1", p1);
        request.setAttribute("daysOfTheWeek", days);
        request.getRequestDispatcher("hello.jsp").forward(request, response);

    }
}
