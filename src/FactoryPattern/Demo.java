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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalFactory factory = new AnimalFactory();
        
        
        Animal animal1 = factory.getAnimal("cat");
        Animal animal2 = factory.getAnimal("dog");
        Animal animal3 = factory.getAnimal("hourse");
        
        System.out.println("Animal 1 speed: " + animal1.maxSpeed());
        System.out.println("Animal 1 sound: " + animal1.makeSound());
        System.out.println("Animal 2 speed: " + animal2.maxSpeed());
        System.out.println("Animal 2 sound: " + animal2.makeSound());
        System.out.println("Animal 3 spped: " + animal3.maxSpeed());
        System.out.println("Animal 3 sound: " + animal3.makeSound());
        
    }
    
}
