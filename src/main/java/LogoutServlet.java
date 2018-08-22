import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            request.getRequestDispatcher("/WEB-INF/logout.jsp").forward(request, response);
            return;
        }
        response.sendRedirect("/login");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String yes = request.getParameter("yes");
        String no = request.getParameter("no");

        if (yes != null) {
            session.invalidate();
            response.sendRedirect("/login");
            return;
        }
        response.sendRedirect("/profile");
    }
}
