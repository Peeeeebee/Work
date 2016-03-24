/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.SkillTable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maruyama
 */
public class SkillTable {
    ResultSet rs = null;
    public ResultSet getSelectResult(Connection con){
        try {
            Statement stm = con.createStatement();
            String sql = "select * from skill_table";
            rs = stm.executeQuery(sql);
        }catch (SQLException e) {
            System.out.println("skill_tableテーブルのSELECT失敗");
        }
        return rs;
    }
}
