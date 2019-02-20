/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author dongnq
 */
public class SE_Department {
    
    private static SE_Department se_DepInstance = new SE_Department();

    public SE_Department() {
    }
    
    public static SE_Department getInstance(){
        return se_DepInstance;
    }
    
    
    public void showInfo(){
        System.out.println("This is SE Department");
    }
    
    
}
