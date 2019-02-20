/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCParttern;

import java.util.List;

/**
 *
 * @author dongnq
 */
public class View {
    
    public void showAnAccount(Model model){
        System.out.println("ID: " + model.getId());
        System.out.println("USERNAME: " + model.getUsername());
        System.out.println("PASSWORD: " + model.getPassword());
    }
    
    public void showTotalAccount(List<Model> models){
        System.out.println("Number of accounts: " + models.size());
        for (Model model : models) {
            showAnAccount(model);
        }
    }
    
    
    
}
