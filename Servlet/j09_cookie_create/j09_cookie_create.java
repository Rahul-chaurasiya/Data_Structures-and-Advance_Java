
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j09_cookie_create extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet create cookie</title>");
        out.println("</head>");
        out.println("<body>");

        // Creating a string to store the name
        String name = request.getParameter("name");
        out.println("<h1> Hello, welcome to " + name + " </h1>");
        out.println("<h1><a href =\"response\">Go to Servlet2</a></h1>");

        // Creating a cookie
        Cookie c = new Cookie("user_name", name);
        response.addCookie(c);

        out.println("</body>");
        out.println("</html>");
    }

}
