/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVPPattern;

import java.util.List;

/**
 *
 * @author dongnq
 */
public class View1 {
    
    
    public void showAllModel(List<Model> models){
        for (Model model : models) {
            System.out.println("ID: " + model.getId());
            System.out.println("USERNAME: " + model.getUsername());
            System.out.println("PASSWORD: " + model.getPassword());
        }
    }
    
}
