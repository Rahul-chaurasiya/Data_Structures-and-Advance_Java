
// simple servlet m hmko servlet interface ki 3 methods ko override krna pda tha init, service and destroy but jb genericServlet interface extend krte h tb sirf service method ko override krna pdta h
// servlet --> generic servlet --> http servlet
// java class k saath HttpServlet interface extend krne pr hmko dopost ya doget method override krni pdti h service method already HttpServlet interface m written hoti h 



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j03_http_servlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<br>Welcome</br>");
        pw.println("<br>This is HTTP Servlet Example</br>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
