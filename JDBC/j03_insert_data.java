package JDBC;

import java.sql.*;

public class j03_insert_data {

    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating a connection
            String db_url = "jdbc:mysql://localhost:3306/university?useSSL=false";
            String db_uname = "root";
            String db_upass = "*********";
            Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);

            // create a query
            String q = "insert into student (sid, Name, Age)value(?,?,?)";

            // get the preparedstatement object
            PreparedStatement st = con.prepareStatement(q);

            // set values to query
            st.setInt(1, 2);
            st.setString(2, "Rohit");
            st.setInt(3, 19);

            st.executeUpdate();
            System.out.println("Data is inserted in database ...");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
