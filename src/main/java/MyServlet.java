import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Aleksandr on 05.08.2017.
 */
@WebServlet("/srv")
public class MyServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("Hello Word 2");

        boolean res = new Logics().eq(1, 2);
        String varTextA = "Hello World!";
        request.setAttribute("textA", varTextA);
        String varTextB = "It JSP." + res;
        request.setAttribute("textB", varTextB);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
