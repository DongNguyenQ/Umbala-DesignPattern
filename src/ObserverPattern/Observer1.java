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
public class Observer1 extends Observer{
    

    public Observer1(User user) {
        this.user = user;
        this.user.attach(this);
    }

    @Override
    public void userNameChanged() {
        System.out.println("Observer1 ----------> Previous name: " + user.getPrevName() + " | " + "New name: " + user.getName());
    }

    
    
    
    
    
    
    
}
