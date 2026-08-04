package MiniProject;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionUtil {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XEPDB1","hr","hr");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
