
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j05_form extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init call");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String nm = req.getParameter("nm");
        String pwd = req.getParameter("pwd");
        String address = req.getParameter("address");
        String gen = req.getParameter("gen");
        String info[] = req.getParameterValues("chk");
        String city = req.getParameter("city");
        String cond = req.getParameter("condition");

        if (cond != null) {
            if (cond.equals("checked")) {
                out.println("<b>Name=" + nm + "</b><br>");
                out.println("<b>Password=" + pwd + "</b><br>");
                out.println("<b>Address=" + address + "</b><br>");
                out.println("<b>Gender=" + gen + "</b><br>");
                out.println("hobbies=");

                out.println("<ul>");
                for (String b : info) {
                    out.println("<li>");
                    out.println(b);
                    out.println("</li>");
                }
                out.println("</ul><br>");
                out.println("<b>City=" + city + "</b>");
            } else {
                out.print("You have not checked terms and conditions");
            }
        } else {
            out.print("You have not checked terms and conditions");
        }
    }

}
