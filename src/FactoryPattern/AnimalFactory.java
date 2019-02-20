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
public class AnimalFactory {
    
    
    public Animal getAnimal(String type){
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        } else if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("hourse")) {
            return new Hourse();
        }
        return null;
    }
}
