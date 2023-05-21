
// simple servlet m hmko servlet interface ki 3 methods ko override krna pda tha init, service and destroy but jb genericServlet interface extend krte h tb sirf service method ko override krna pdta h 


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class j02_generic_servlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<br>Welcome</br>");
        pw.println("<br>This is Generic Servlet Example</br>");
        pw.println("</body>");
        pw.println("</html>");
    }
}
