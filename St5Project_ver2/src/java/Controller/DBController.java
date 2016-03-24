/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SQLMain;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author maruyama
 */
public class DBController {
     SQLMain sqlmain = null;
    
     DBController(){   
     }
     public String getCharaTable(){
         sqlmain = new SQLMain();
         String name = null;
         ResultSet rs = sqlmain.getResult("chara");
         //while(rs.next()){
          try {
         rs.next();       
         int id = rs.getInt("id");
         name = rs.getString("name");
            //
          }catch (SQLException e) {
            System.out.println("結果取得後のエラー");
         }
         return name;
     }
}
