import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class CountServlet extends HttpServlet {

    int count = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter output = null;
        if (req.getParameter("reset") != null) {
            count = 0;
            res.sendRedirect("/count");
            return;
        } else {
            try {
                output = res.getWriter();
                output.println("<h1>" + (count += 1 ) + "</h1>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}