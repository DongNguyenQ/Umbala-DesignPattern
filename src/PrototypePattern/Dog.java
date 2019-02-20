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
public class Dog extends Animal{

    public Dog() {
        type = "dog";
    }

    
    
    @Override
    void makeSound() {
        System.out.println("Gau gau");
    }
    
}
