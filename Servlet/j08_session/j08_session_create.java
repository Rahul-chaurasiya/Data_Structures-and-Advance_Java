
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class j08_session_create extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        String nm = req.getParameter("username"); 
        String mail = req.getParameter("email");
        
        out.println("<b>Name = " + nm + "</b><br>");
        out.println("<b>Email = " + mail + "</b><br>");
        
        HttpSession session = req.getSession();
        session.setAttribute("Username", nm);
        session.setAttribute("Email", mail);
        out.println("<a href='response' >Session Response </a>");
    }
}
