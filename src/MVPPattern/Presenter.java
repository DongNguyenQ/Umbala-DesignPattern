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
public class Presenter {
    
    private List<Model> models;
    private View view;

    public Presenter(List<Model> models, View view) {
        this.models = models;
        this.view = view;
    }
    
    
    public Model getModelById(int id){
        for (Model model : models) {
            if(id == model.getId())
                return model;
        }
        return null;
    }
    
    
    public boolean updateModel(int id, String username, String password){
        for (Model model : models) {
            if(id == model.getId()){
                model.setUsername(username);
                model.setPassword(password);
                return true;
            }
            
        }
        return false;
    }
    
    
    public void updateView(){
        view.showAModel(getModelById(0));
    }
    
    
    
    
}
