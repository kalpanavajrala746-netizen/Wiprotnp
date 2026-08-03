package PreparedStatements;

import java.sql.*;

public class UpdateStudent {

    public static void main(String args[]) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@//127.0.0.1:1521/XEPDB1",
                    "hr",
                    "hr");

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?");

            ps.setDouble(1,4500);
            ps.setInt(2,101);

            int i = ps.executeUpdate();

            if(i>0)
                System.out.println("Record Updated");
            else
                System.out.println("Record Not Found");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}