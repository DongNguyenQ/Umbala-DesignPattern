/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorPattern;

/**
 *
 * @author dongnq
 */
public class demo {
    
    
    public static void main(String[] args){
        StudentRepo studentRepo = new StudentRepo();
        
        for (Iterator iterator = studentRepo.getIterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println("Student: " + next.toString());
        }
    }
}
