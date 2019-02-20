/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dongnq
 */
public class User {
    private List<Observer> observers = new ArrayList<Observer>();
    private String name;
    private String prevName;

   public String getName() {
      return name;
   }

   public void setName(String name) {
        
        prevName = this.name;
        this.name = name;
        notifyAllObservers();
   }

    public String getPrevName() {
        return prevName;
    }

    public void setPrevName(String prevName) {
        this.prevName = prevName;
    }
   
   

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.userNameChanged();
      }
   } 	
}
