package webapp;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{

    @Inject
    private ExampleBean exampleBean;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("Login: "+exampleBean.getLogin());
        resp.getWriter().append("\r\nPassword: "+ exampleBean.getPassword());

        HttpSession session = req.getSession();


        if (session.getValue("name")== null) {
            System.out.println();
            session.putValue("name", "Hello world Session");
            resp.getWriter().append("No Session");
        }else
            resp.getWriter().append((String)session.getValue("name"));

    }
}
