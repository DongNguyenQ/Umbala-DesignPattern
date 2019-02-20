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
public class SB_Department {
    
    private static SB_Department sb_DepInstance = new SB_Department();

    public SB_Department() {
    }
    
    
    public static SB_Department getInstance(){
        return sb_DepInstance;
    }
    
    public void showInfo(){
        System.out.println("This is SB department");
    }
}
