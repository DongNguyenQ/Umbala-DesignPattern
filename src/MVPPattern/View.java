/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVPPattern;

/**
 *
 * @author dongnq
 */
public class View {
    
    
    public void showAModel(Model model){
        System.out.println("ID: " + model.getId());
        System.out.println("USERNAME: " + model.getUsername());
        System.out.println("PASSWORD: " + model.getPassword());
    }
    
}
