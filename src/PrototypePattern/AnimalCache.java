/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

import java.util.Hashtable;

/**
 *
 * @author dongnq
 */
public class AnimalCache {
    
    private static Hashtable<String, Animal> animalMap = new Hashtable<String, Animal>();
    
    public static Animal getAnimal(String animalID){
        Animal cachedAnimal = animalMap.get(animalID);
        return (Animal) cachedAnimal.clone();
    }
    
    
    public static void loadCache(){
        Cat cat = new Cat();
        cat.setId("1");
        animalMap.put(cat.getId(), cat);
        
        Dog dog = new Dog();
        dog.setId("2");
        animalMap.put(dog.getId(), dog);
    }
}
