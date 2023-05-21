
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j01_servlet extends HttpServlet {
   
    @Override
    public void init() throws ServletException {
        System.out.println("init call");
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<br>Welcome</br>");
        pw.print("<h1>Now date and time is "+new Date().toString()+"</h1>");
        pw.println("</body>");
        pw.println("</html>");
        System.out.println("service........");
    }
    
    @Override
    public void destroy(){
        super.destroy();
    }
}
