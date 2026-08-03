package ExecuteQuery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class EmpDetails {
	 public static void main(String[] args) 
	 {
	        Connection con = null;
	        Statement stmt = null;
	        ResultSet rs = null;
	        try 
	        {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@//127.0.0.1:1521/xepdb1",
	                    "hr",
	                    "hr");
	            stmt = con.createStatement();
	            rs = stmt.executeQuery("SELECT EMPLOYEE_ID, LAST_NAME FROM EMPLOYEES");
	            while(rs.next()) 
	            {
	                System.out.println(
	                        rs.getInt(1) + "\t" +
	                        rs.getString("LAST_NAME")
	                );
	            }
	            rs.close();
	            stmt.close();
	            con.close();
	        }
	        catch(Exception e) 
	        {
	            System.out.println(e);
	        }
	    }
}