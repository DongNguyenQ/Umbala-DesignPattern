/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVPPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dongnq
 */
public class demo {
    
    
    public static void main(String[] args){
        List<Model> models = mockData();
        
        View view = new View();
        
        View1 view1 = new View1();
        
        Presenter presenter = new Presenter(models, view);
        
        Presenter1 presenter1 = new Presenter1(models, view1);
        
        presenter.updateView();
        
        System.out.println("================================");
        
        presenter1.updateView1();
        
        System.out.println("================================");
        
        presenter.updateModel(0, "new", "newpass");
        
        presenter.updateView();
        
        System.out.println("================================");
        
        presenter1.updateView1();
        
        System.out.println("================================");
        
        presenter1.removeLastAccount();
        
        presenter.updateView();
        
        System.out.println("================================");
        
        presenter1.updateView1();
        
        System.out.println("================================");
        
    }
    
    
    public static List<Model> mockData(){
        List<Model> models = new ArrayList<Model>();
        models.add(new Model(0, "a", "apass"));
        models.add(new Model(1, "b", "bpass"));
        models.add(new Model(2, "c", "cpass"));
        return models;
    }
}
