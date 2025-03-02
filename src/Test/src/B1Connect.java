import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class B1Connect {
    private static Connection connection;
    private static String url = "jdbc:mysql://localhost:3306/qlsv";
    private static String user = "root";
    private static String password = "";
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        if(connection==null){
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connect Successfully");
        }
        return connection;
    }
}
