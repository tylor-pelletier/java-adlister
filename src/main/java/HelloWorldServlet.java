import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("hello");
        res.setContentType("text/html");
        PrintWriter output = null;
        String name;
        if (req.getParameter("name") != null) {
            name = req.getParameter("name");
        } else {
            name = "World";
        }

        try {
            output = res.getWriter();
            output.println("<h1>" + "Hello " + name + "</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//@WebServlet(name = “SayHelloServlet”, urlPatters = “/hi”)
//Public class SayHelloServlet extends HttpServlet {
//
//    @Override
//    protected void doGet (HttpServletRequest req, HttpServletResponse, resp) throws ServletException, IOException {
//        System.out.println(“hello”);
//        resp.setContentType(“text/html”);
//        PrintWriter output = resp.getWriter();
//        output.println(“<h1>Hello</h1>”)
//    }
//}
//
//@WebServlet(name = “SayGoodbyeServlet”, urlPatters = “/bye”)
//Public class SayGoodbyeServlet extends HttpServlet {
//
//    @Override
//    protected void doGet (HttpServletRequest req, HttpServletResponse, resp) throws ServletException, IOException {
//        Res.setContentType(“text/html”);
//
//        String filterVar = req.getParameter(“filter”);
//        Double priceVar = Double.parseDouble(req.getParameter(“price”));
//        PrintWriter printer = resp.getWriter();
//
//        price += 1;
//
//        printer.println(“New price: “ + price);
//        printer.println(“selected filter: “ + filterVar);
//        System.out.println(“goodbye”);
//        printer.println(“<h1>Goodbye</h1>”)
//    }
//}
//
//@WebServlet(name = “FormServlet”, urlPatters = “/register”)
//Public class FromServlet extends HttpServlet {
//
//    @Override
//    protected void doGet (HttpServletRequest req, HttpServletResponse, resp) throws ServletException, IOException {
//        System.out.println(“email submitted: “ + req.getParameter(“email”));
//        resp.sendRedirect(“/bye”);
//    }
//}