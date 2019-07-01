package apotiknusantara;

import java.sql.*;
import javax.swing.JOptionPane;

public class Connector {
    private static Connection konek;
    public static Connection Connect(String Dbs) throws SQLException{
            try {
                String DB = "jdbc:mysql://localhost:3306/" + Dbs;
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = (Connection) DriverManager.getConnection(DB, username, password);
                return konek;
            } catch (SQLException sQLException) {
                JOptionPane.showMessageDialog(null, sQLException.toString());
            }
        return null;
    }
}
