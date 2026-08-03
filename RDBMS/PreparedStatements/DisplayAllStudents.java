package PreparedStatements;

import java.sql.*;

public class DisplayAllStudents {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@//127.0.0.1:1521/XEPDB1",
                "hr",
                "hr");

            System.out.println("Connected Successfully");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");

            while(rs.next()) {

                System.out.println("RollNo      : " + rs.getInt("ROLLNO"));
                System.out.println("StudentName : " + rs.getString("STUDENTNAME"));
                System.out.println("Standard    : " + rs.getString("STANDARD"));
                System.out.println("DOB         : " + rs.getDate("DATE_OF_BIRTH"));
                System.out.println("Fees        : " + rs.getDouble("FEES"));
                System.out.println("----------------------------");
            }

            rs.close();
            st.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}