package JDBC;

import java.sql.*;
public class j05_insert_multiple_data {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_url = "jdbc:mysql://localhost:3306/university";
            String db_uname = "root";
            String db_upass = "********";
            Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);
            Statement st = con.createStatement();
            String s = "insert into student (Name,Age) values('Aditya', 24),('Akshat', 23),('Naveen', 20),('Rihan', 24)";
            st.executeUpdate(s);

            System.out.println("data inserted....");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
