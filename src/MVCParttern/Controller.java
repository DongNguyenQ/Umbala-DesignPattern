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
public class Controller {
    
    private View view;
    private List<Model> models;

    public Controller(View view, List<Model> models) {
        this.view = view;
        this.models = models;
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
    
    
    public boolean deleteModel(int id) {
        for (Model model : models) {
            if(id == model.getId()){
                models.remove(model);
                return true;
            }
        }
        return false;
    }
    
    
    
    public void updateView() {
        view.showTotalAccount(models);
    }
    
}
