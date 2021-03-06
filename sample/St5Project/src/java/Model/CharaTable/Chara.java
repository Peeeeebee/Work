package Model.CharaTable;
// Generated 2016/02/29 8:27:58 by Hibernate Tools 4.3.1



/**
 * Chara generated by hbm2java
 */
public class Chara  implements java.io.Serializable {


     private int id;
     private String name;
     private String vskill;
     private String vskillMemo;
     private String vtrggerl;
     private String vtrggerMemo;

    public Chara() {
    }

	
    public Chara(int id) {
        this.id = id;
    }
    public Chara(int id, String name, String vskill, String vskillMemo, String vtrggerl, String vtrggerMemo) {
       this.id = id;
       this.name = name;
       this.vskill = vskill;
       this.vskillMemo = vskillMemo;
       this.vtrggerl = vtrggerl;
       this.vtrggerMemo = vtrggerMemo;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getVskill() {
        return this.vskill;
    }
    
    public void setVskill(String vskill) {
        this.vskill = vskill;
    }
    public String getVskillMemo() {
        return this.vskillMemo;
    }
    
    public void setVskillMemo(String vskillMemo) {
        this.vskillMemo = vskillMemo;
    }
    public String getVtrggerl() {
        return this.vtrggerl;
    }
    
    public void setVtrggerl(String vtrggerl) {
        this.vtrggerl = vtrggerl;
    }
    public String getVtrggerMemo() {
        return this.vtrggerMemo;
    }
    
    public void setVtrggerMemo(String vtrggerMemo) {
        this.vtrggerMemo = vtrggerMemo;
    }




}


