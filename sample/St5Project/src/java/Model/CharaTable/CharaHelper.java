/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CharaTable;

import Model.CharaTable.Chara;
import Model.HibernateUtil;
import Model.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author maruyama
 */
public class CharaHelper {
    Session session = null;
    
    public CharaHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getChara(int startID, int endID) {
    List<Chara> CharaList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("select chara0_.id as col_0_0_ from test_schema.chara chara0_");
        CharaList = (List<Chara>) q.list();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return CharaList;
}
}