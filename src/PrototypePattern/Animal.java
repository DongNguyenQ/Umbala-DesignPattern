/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dongnq
 */
public abstract class Animal implements Cloneable{
    
    private String id;
    protected String type;
    
    abstract void makeSound();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
    
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clone;
    }
    
}
