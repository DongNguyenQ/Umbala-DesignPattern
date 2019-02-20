/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCParttern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dongnq
 */
public class demo {
    
    public static void main(String[] args) {
        
        List<Model> models = mockData();
        
        View view = new View();
        
        Controller controller = new Controller(view, models);
        
        controller.updateView();
        
        System.out.println("===================================");
        
        controller.updateModel(2, "d", "dpass");
        
        controller.updateView();
        
        System.out.println("===================================");
        
        controller.deleteModel(0);
        
        controller.updateView();
        
    }
    
    public static List<Model> mockData(){
        List<Model> models = new ArrayList<Model>();
        models.add(new Model(0, "a", "apass"));
        models.add(new Model(1, "b", "bpass"));
        models.add(new Model(2, "c", "cpass"));
        return models;
    }
}
