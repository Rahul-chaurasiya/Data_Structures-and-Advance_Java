package JDBC;

import java.sql.*;
import java.util.Scanner;
public class j06_dynamic_data_insert {

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
            String q = "insert into student (Name, Age)value(?,?)";

            // get the preparedstatement object
            PreparedStatement stmt = con.prepareStatement(q);

            // taking input data
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            String num = sc.next();

            // set values to query
            stmt.setString(1, name);
            stmt.setString(2, num);

            stmt.executeUpdate();
            System.out.println("Data is inserted in database dynamically ...");
            con.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
