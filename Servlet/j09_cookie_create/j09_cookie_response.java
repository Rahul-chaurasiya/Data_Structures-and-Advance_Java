
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j09_cookie_response extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Response cookie</title>");
        out.println("</head>");
        out.println("<body>");

        // Fetching cookies(if found more than one)
        // Array of Cookies
        Cookie[] cookies = request.getCookies();
        boolean f = false;
        String name = "";
        
        if (cookies == null) {
            out.println("<h1>You are new user, go to home page and submit your institute's name");
            return;
        } else {
            for (Cookie c : cookies) {
                String tname = c.getName();
                if (tname.equals("user_name")) {
                    f = true;
                    name = c.getValue();
                }
            }
        }
        if (f) {
            out.println("<h1> Hello, welcome back " + name + " </h1>");
            out.println("<h2>Thank you!!</h2>");
        } else {
            out.println(
                    "<h1>You are new user, go to home page and submit your institute's name");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
