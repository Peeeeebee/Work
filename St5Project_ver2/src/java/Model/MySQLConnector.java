package Model;
import java.sql.*;
/**
 *
 * @author maruyama
 */
public class MySQLConnector {
    private Connection con = null;
    public MySQLConnector () {
        try {
            // JDBCドライバのロード - JDBC4.0（JDK1.6）以降は不要
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // MySQLに接続
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_schema","SystemUser","System_User");
            System.out.println("MySQLに接続できました。");
            
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("JDBCドライバのロードに失敗しました。");
        } catch (SQLException e) {
            System.out.println("MySQLに接続できませんでした。");
        }
        }
    public Connection getConnection(){
        return this.con;
    }

}
