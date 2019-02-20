/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

/**
 *
 * @author dongnq
 */
public class Demo {
    
    
    public static void main(String[] args){
        
        AnimalCache.loadCache();
        
        Animal animal1 = AnimalCache.getAnimal("1");
        System.out.println("Animal 1 type: " + animal1.getType());
        
        Animal animal2 = AnimalCache.getAnimal("2");
        System.out.println("Animal 2 type: " + animal2.getType());
        
        
    }
    
}
