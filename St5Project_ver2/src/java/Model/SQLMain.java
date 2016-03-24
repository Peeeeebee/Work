package Model;

import Model.SkillTable.SkillTable;
import Model.CharaTable.CharaTable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maruyama
 */
public class SQLMain {
        private Connection con = null;
        private MySQLConnector Mysqlcon = null;
        
        public SQLMain(){
                Mysqlcon = new MySQLConnector();
                this.con = Mysqlcon.getConnection();
        }
        
        public ResultSet getResult(String tableName){
            ResultSet rs = null;
            
            switch (tableName){
                case "chara":
                    CharaTable ctb = new CharaTable();
                    rs = ctb.getSelectResult(this.con);
                case "skill_table":
                    SkillTable stb = new SkillTable();
                    rs = stb.getSelectResult(this.con);
            }
            try {
                Statement stm = this.con.createStatement();
                String sql = "select * from chara";
                rs = stm.executeQuery(sql);
            } catch (SQLException e) {
            System.out.println("MySQLに接続できませんでした。");
            } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("MySQLのクローズに失敗しました。");
                }
            }
        }
            return rs;
        }
}
