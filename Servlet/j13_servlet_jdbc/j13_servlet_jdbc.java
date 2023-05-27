
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j13_servlet_jdbc extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String nm = req.getParameter("username");
        String age = req.getParameter("password");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university?useSSL=false", "root", "#Rahul123");
            String q = "insert into student value(?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, 10);
            ps.setString(2, nm);
            ps.setString(3, age);

            int x = ps.executeUpdate();
            if (x > 0) {
                out.println("Record inserted");
            } else {
                out.println("Record not inserted");
            }
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }

    }

}
