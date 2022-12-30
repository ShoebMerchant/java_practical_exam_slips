
/**
 * Write a program to create JDBC connection. On successful connection with
 * database display appropriate message to user.
 */
import java.io.*;
import java.sql.*;

class Q1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:5432/table_name"; // table details
        String username = "rootgfg"; // MySQL credentials
        String password = "gfg123";
        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        con.close(); // close connection
        System.out.println("Connection Closed....");
    }
}