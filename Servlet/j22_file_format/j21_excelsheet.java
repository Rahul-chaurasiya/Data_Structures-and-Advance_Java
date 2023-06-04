
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class j21_excelsheet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/vnd.ms-excel");
        PrintWriter pw = resp.getWriter();
        pw.println("<table border='1'>");
        pw.println("<tr><th>code</th><th>name</th></tr>");
        pw.println("<tr><td>101</td><td>cd1</td></tr>");
        pw.println("<tr><td>102</td><td>cd2</td></tr>");
        pw.println("<tr><td>103</td><td>cd3</td></tr>");
        pw.println("<tr><td>104</td><td>cd4</td></tr>");
        pw.println("<tr><td>105</td><td>cd5</td></tr>");
        pw.println("<tr><td>106</td><td>cd6</td></tr>");
        pw.println("<tr><td>107</td><td>cd7</td></tr>");
        pw.println("<tr><td>108</td><td>cd8</td></tr>");

        pw.println("</table>");

        pw.println("success");
    }

}
