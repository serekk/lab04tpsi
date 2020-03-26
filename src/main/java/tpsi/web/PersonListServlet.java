package tpsi.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})


public class PersonListServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Person p1 = new Person("Bill", "Gates", "bgates@ms.com");
        Person p2 = new Person("Gal", "Anonim", "ganonim@zut.edu.pl");
        Person p3 = new Person("Jan", "Kowalski", "jkowalski@zut.edu.pl");

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        request.setAttribute("persons", persons);
        request.getRequestDispatcher("persons.jsp").forward(request, response);

    }
}
