
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class j10_urlrewriting_name extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException{
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String nm = req.getParameter("name");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>URL Rewriting name</title>");
        out.println("</head>");
        out.println("<body>"); 
        out.println("<b>Yous Name is " + nm + "</b><br>");
        out.println("<a href='take?user="+nm+"' >Display name in another servlet</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
