/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author maruyama
 */
@Named(value = "testBean")
@Dependent
public class TestBean {
    private int test = 3;
    /**
     * Creates a new instance of TestBean
     */
    public TestBean() {
    }
    public int gettest(){
        return test;
    }
    
}
