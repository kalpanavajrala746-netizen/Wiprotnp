package Transactions;
	import java.sql.*;

	public class NetSalary {

	    public static void main(String[] args) {

	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@//127.0.0.1:1521/XEPDB1",
	                    "hr",
	                    "hr");

	            Statement st = con.createStatement();

	            ResultSet rs = st.executeQuery(
	                    "SELECT ID, FIRST_NAME, LAST_NAME FROM EMP");

	            CallableStatement cs =
	                    con.prepareCall("{call NETSAL(?,?)}");

	            System.out.println("ID\tFIRST_NAME\tLAST_NAME\tNET SALARY");

	            while (rs.next()) {

	                cs.setInt(1, rs.getInt("ID"));
	                cs.registerOutParameter(2, Types.NUMERIC);

	                cs.execute();

	                System.out.println(
	                        rs.getInt("ID") + "\t" +
	                        rs.getString("FIRST_NAME") + "\t\t" +
	                        rs.getString("LAST_NAME") + "\t\t" +
	                        cs.getDouble(2));
	            }

	            rs.close();
	            cs.close();
	            st.close();
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}