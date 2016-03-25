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
            
            if(tableName.equals("chara")){
                    CharaTable ctb = new CharaTable();
                    rs = ctb.getSelectResult(this.con);
            }
            else{
                    SkillTable stb = new SkillTable();
                    rs = stb.getSelectResult(this.con);
            }
            return rs;
        }
}
