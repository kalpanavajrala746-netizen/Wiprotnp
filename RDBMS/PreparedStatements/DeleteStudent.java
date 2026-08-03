package PreparedStatements;

	import java.sql.*;

	public class DeleteStudent {
	    public static void main(String args[]) {
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@//127.0.0.1:1521/XEPDB1",
	                    "hr",
	                    "hr");

	            PreparedStatement ps = con.prepareStatement(
	                    "DELETE FROM STUDENT WHERE ROLLNO=?");

	            ps.setInt(1,101);

	            int i = ps.executeUpdate();

	            if(i>0)
	                System.out.println("Record Deleted");

	            con.close();

	        } catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	}