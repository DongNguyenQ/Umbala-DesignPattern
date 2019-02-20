/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 *
 * @author dongnq
 */
public class demo {
    
    
    
    public static void main(String[] args){
        User user = new User();
        
        Observer ob1 = new Observer1(user);
        Observer ob2 = new Observer2(user);

        
        System.out.println("User name changed to abc");
        user.setName("abc");
        
        

        System.out.println("User name changed to cde");
        user.setName("cde");
    }
}
