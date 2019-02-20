/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author dongnq
 */
public class Dog implements Animal{

    @Override
    public double maxSpeed() {
        return 20.0;
    }

    @Override
    public String makeSound() {
        return "Gau gau";
    }
    
}
