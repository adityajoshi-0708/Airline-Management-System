package airlinemanagementsystem;

import java.sql.*;

public class Conn {
    
    Connection c; //interfaces for connection
    Statement s;  // for sql query
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load mysql jdbc driver
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "Aditya#435");
            // make a statement
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

