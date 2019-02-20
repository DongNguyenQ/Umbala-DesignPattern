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
public class Observer2 extends Observer{
    

    public Observer2(User user) {
        this.user = user;
        this.user.attach(this);
    }

    @Override
    public void userNameChanged() {
        System.out.println("Observer2 ------> Previous name: " + user.getPrevName() + " | " + "New name: " + user.getName());
    }

}
  