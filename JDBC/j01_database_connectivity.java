package JDBC;
import java.sql.*;
import java.util.*;
class j01_database_connectivity {

    public static void main(String[] args) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Creating a connection
            String db_url = "jdbc:mysql://localhost:3306/university?useSSL=false";
            String db_uname = "root";
            String db_upass = "#Rahul123";
            Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);

            if (con.isClosed()) {
                System.out.println("connection is closed");
            } else {
                System.out.println("connection is open");
            }

            Scanner sc = new Scanner(System.in);
            
            System.out.println("If you want to close the connection so you write close to close the connection : s");
            String str = sc.next();
            if(str.equals("close")){
                con.close();
            }
            
            
            if (con.isClosed()) {
                System.out.println("connection is closed");
            } else {
                System.out.println("connection is open");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
