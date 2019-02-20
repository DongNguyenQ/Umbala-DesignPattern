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
public class Hourse implements Animal{

    @Override
    public double maxSpeed() {
        return 35.6;
    }

    @Override
    public String makeSound() {
        return "Hí hí hí hí";
    }
    
}
