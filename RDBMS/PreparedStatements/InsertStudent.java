package PreparedStatements;

import java.sql.*;

public class InsertStudent {

    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//127.0.0.1:1521/XEPDB1",
                    "hr",
                    "hr");

            String sql = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 101);
            ps.setString(2, "AJIT");
            ps.setString(3, "IV");
            ps.setDate(4, Date.valueOf("2001-11-20"));
            ps.setDouble(5, 4000);

            int i = ps.executeUpdate();

            if(i > 0)
                System.out.println("Record Inserted Successfully");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}