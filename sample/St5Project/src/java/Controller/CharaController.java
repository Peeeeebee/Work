/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CharaTable.Chara;
import Model.CharaTable.CharaHelper;
import javax.inject.Named;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author maruyama
 */
@Named(value = "charaController")
@SessionScoped
public class CharaController implements Serializable {
    private int Word = 1;
    public CharaController() {

    }
    
    public String nextPage() {
        return "CommandPage";
    } 
    private void setWord(int word) {
        this.Word = 22;
    } 
    public int getWord() {
        return Word;
    }
}
