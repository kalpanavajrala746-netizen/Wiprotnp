	package PreparedStatements;

	import java.sql.*;

	public class DisplayStudent {

	    public static void main(String[] args) {

	        try {

	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@//127.0.0.1:1521/XEPDB1",
	                    "hr",
	                    "hr");

	            if (args.length == 0) {

	                Statement st = con.createStatement();
	                ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");

	                while (rs.next()) {
	                    System.out.println(
	                            rs.getInt("ROLLNO") + " " +
	                            rs.getString("STUDENTNAME") + " " +
	                            rs.getString("STANDARD") + " " +
	                            rs.getDate("DATE_OF_BIRTH") + " " +
	                            rs.getDouble("FEES"));
	                }

	            } else {

	                PreparedStatement ps = con.prepareStatement(
	                        "SELECT * FROM STUDENT WHERE ROLLNO=?");

	                ps.setInt(1, Integer.parseInt(args[0]));

	                ResultSet rs = ps.executeQuery();

	                if (rs.next()) {
	                    System.out.println(
	                            rs.getInt("ROLLNO") + " " +
	                            rs.getString("STUDENTNAME") + " " +
	                            rs.getString("STANDARD") + " " +
	                            rs.getDate("DATE_OF_BIRTH") + " " +
	                            rs.getDouble("FEES"));
	                } else {
	                    System.out.println("Record Not Found");
	                }
	            }

	            con.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}