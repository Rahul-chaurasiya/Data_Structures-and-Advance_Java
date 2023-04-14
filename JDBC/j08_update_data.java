package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class j08_update_data {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "#Rahul123");
            String q = "Update student SET Name = 'Vikky' where sid = 4";
            Statement st = con.createStatement();
            st.executeUpdate(q);
            System.out.println("record updated ...");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
