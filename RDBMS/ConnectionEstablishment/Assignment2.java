package Connectionestablishment;
import java.sql.*;

public class Assignment2 {
    public static void main(String[] args) {
        try {
            

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@//127.0.0.1:1521/XEPDB1",
                "hr",
                "hr"
            );

            System.out.println("Connection Established successfully");

            con.close();
        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println(e);
        }
    }
}