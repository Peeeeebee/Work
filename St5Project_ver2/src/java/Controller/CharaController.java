/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.SQLMain;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author maruyama
 */
@Named(value = "charaController")
@Dependent
public class CharaController {
    private SQLMain sqlmain = null;
    private String name = null;
    private ResultSet rs = null;
    /**
     * Creates a new instance of CharaController
     */
    public CharaController() {
        this.sqlmain = new SQLMain();
    }
    
    public void CharaTable(){     
         this.rs = sqlmain.getResult("chara");
         //while(rs.next()){
          try {
         rs.next();       
         int id = rs.getInt("id");
         name = rs.getString("name");
            //
          }catch (SQLException e) {
            System.out.println("結果取得後のエラー");
         }
          System.out.println(name);
     }
    
}
