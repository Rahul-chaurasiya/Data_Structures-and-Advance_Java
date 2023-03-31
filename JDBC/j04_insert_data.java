package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class j04_insert_data {

    public static void main(String ar[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db_url = "jdbc:mysql://localhost:3306/university";
            String db_uname = "root";
            String db_upass = "********";
            Connection con = DriverManager.getConnection(db_url, db_uname, db_upass);
            Statement st = con.createStatement();
            String q = "insert into student (Name, Age)value('Vickey', 20)";
            st.executeUpdate(q);

            System.out.println("data insert");
            con.close();
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }
}
