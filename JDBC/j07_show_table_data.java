package JDBC;

import java.sql.*;
import java.sql.DriverManager;
public class j07_show_table_data {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "********");
            String q = "select * from student";
            PreparedStatement ps = con.prepareStatement(q);
            ResultSet rs = ps.executeQuery(q);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
