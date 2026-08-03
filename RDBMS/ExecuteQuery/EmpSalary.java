package ExecuteQuery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class EmpSalary {
	 public static void main(String[] args) {
		 String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	        String username = "hr";
	        String password = "hr";
	        Connection con = null;
	        Statement stmt = null;
	        ResultSet rs = null;
	        try {
	            con = DriverManager.getConnection(url, username, password);
	            stmt = con.createStatement();
	            String query = "SELECT first_name, job_id, salary, commission_pct "+"FROM employees " +"WHERE salary > 1000 AND salary < 2000";
	            rs = stmt.executeQuery(query);
	            System.out.println("FIRST_NAME\tJOB_ID\t\tSALARY\tCOMMISSION");
	            while (rs.next()) {
	                System.out.println(rs.getString("first_name") + "\t\t"+ rs.getString("job_id") + "\t"+ rs.getDouble("salary") + "\t"+ rs.getString("commission_pct"));
	            }
	            rs.close();
	            stmt.close();
	            con.close();
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Connection could not be established.");
	            System.out.println(e.getMessage());
	        }
	  }
}