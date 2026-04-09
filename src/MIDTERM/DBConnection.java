
package MIDTERM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/it26a_malaya", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
