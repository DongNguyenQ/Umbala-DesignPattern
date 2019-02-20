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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SE_Department seDepart = SE_Department.getInstance();
        SB_Department sbDepart = SB_Department.getInstance();
        IA_Department iaDepart = IA_Department.getInstance();
        
        seDepart.showInfo();
        sbDepart.showInfo();
        iaDepart.showInfo();
    }
    
}
