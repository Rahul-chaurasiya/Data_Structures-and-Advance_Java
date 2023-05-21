
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j07_welcome_file_list extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        String nm = req.getParameter("username"); 
        String mail = req.getParameter("email");
        String pwd = req.getParameter("password");
        
        out.println("<b>Name = " + nm + "</b><br>");
        out.println("<b>Password = " + pwd + "</b><br>");
        out.print("<b>Email = " + mail + "</b>");
    }

}
