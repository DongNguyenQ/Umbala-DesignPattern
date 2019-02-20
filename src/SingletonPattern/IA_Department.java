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
public class IA_Department {
    
    
    private static IA_Department ia_DepInstance = new IA_Department();

    public IA_Department() {
    }
    
    
    public static IA_Department getInstance(){
        return ia_DepInstance;
    }
    
    public void showInfo(){
        System.out.println("This is IA department");
    }
}
