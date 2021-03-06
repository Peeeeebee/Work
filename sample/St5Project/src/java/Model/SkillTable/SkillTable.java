package Model.SkillTable;
// Generated 2016/02/29 8:27:58 by Hibernate Tools 4.3.1





/**
 * SkillTable generated by hbm2java
 */
public class SkillTable  implements java.io.Serializable {


     private SkillTableId id;
     private String skillName;
     private String command;
     private String SMemo;

    public SkillTable() {
    }

	
    public SkillTable(SkillTableId id) {
        this.id = id;
    }
    public SkillTable(SkillTableId id, String skillName, String command, String SMemo) {
       this.id = id;
       this.skillName = skillName;
       this.command = command;
       this.SMemo = SMemo;
    }
   
    public SkillTableId getId() {
        return this.id;
    }
    
    public void setId(SkillTableId id) {
        this.id = id;
    }
    public String getSkillName() {
        return this.skillName;
    }
    
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    public String getCommand() {
        return this.command;
    }
    
    public void setCommand(String command) {
        this.command = command;
    }
    public String getSMemo() {
        return this.SMemo;
    }
    
    public void setSMemo(String SMemo) {
        this.SMemo = SMemo;
    }




}


