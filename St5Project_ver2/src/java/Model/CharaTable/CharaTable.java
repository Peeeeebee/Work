/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CharaTable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maruyama
 */
public class CharaTable {
    ResultSet rs = null;
    public ResultSet getSelectResult(Connection con){
        try {
            Statement stm = con.createStatement();
            String sql = "select * from chara";
            rs = stm.executeQuery(sql);
        }catch (SQLException e) {
            System.out.println("CharaテーブルのSELECT失敗");
        }
        return rs;
    }
}
