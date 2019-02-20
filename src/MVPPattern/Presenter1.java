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
public class Presenter1 {
    
    private List<Model> models;
    private View1 view1;

    public Presenter1(List<Model> models, View1 view1) {
        this.models = models;
        this.view1 = view1;
    }
    
    
    public List<Model> getListModel(){
        return models;
    }
    
    public void removeLastAccount(){
        models.remove(models.size() - 1);
    }
    
    public void updateView1(){
        view1.showAllModel(getListModel());
    }
    
}
