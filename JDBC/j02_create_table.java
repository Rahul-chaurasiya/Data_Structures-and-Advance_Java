package JDBC;

import java.sql.*;
public class j02_create_table {

    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating a connection
            String db_url = "jdbc:mysql://localhost:3306/university?useSSL=false";
            String db_uname = "root";
            String db_upass = "********";
            Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);

            // create a query
            String q = "create table student(sid int primary key auto_increment, Name varchar(20), Age int)";

            // Create a statement
            Statement st = con.createStatement();

            st.executeUpdate(q);
            System.out.println("Table is created in database ...");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
