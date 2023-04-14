package JDBC;

import java.sql.*;

public class j09_delete_data {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "#Rahul123");
            String q = "Delete from student Where sid = 4";
            Statement st = con.createStatement();
            st.executeUpdate(q);
            System.out.println("record deleted ...");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }
}
