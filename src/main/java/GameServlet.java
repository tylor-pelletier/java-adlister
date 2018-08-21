import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GameServlet", urlPatterns="/guess")
public class GameServlet extends HttpServlet {
    double randNumber = Math.random();
    double d = randNumber * 100;
    int randomInt = (int)d;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getMethod().equalsIgnoreCase("post")) {
            int guess = Integer.parseInt(request.getParameter("guess"));
            if (guess == randomInt) {
                request.setAttribute("guess", guess);
                request.getRequestDispatcher("/correct-guess.jsp").forward(request, response);
            } else if (guess > randomInt) {
                request.setAttribute("guess", guess);
                request.getRequestDispatcher("/high-guess.jsp").forward(request, response);
            } else if (guess < randomInt) {
                request.setAttribute("guess", guess);
                request.getRequestDispatcher("/low-guess.jsp").forward(request, response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }
}
