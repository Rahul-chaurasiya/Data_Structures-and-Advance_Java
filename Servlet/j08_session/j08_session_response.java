import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class j08_session_response extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        HttpSession session = req.getSession();
        String name = (String)session.getAttribute("Username");
        String mail = (String)session.getAttribute("Email");
        
        out.println("<b>Name = " + name + "</b><br>");
        out.println("<b>Email = " + mail + "</b><br>");
    }
}
