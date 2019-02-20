/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericRepo;

import java.util.List;

/**
 *
 * @author dongnq
 */
public interface BaseRepository<T> {
    
    
    public List<T> getAll();
    
    public T getByID(String id);
    
    public List<T> getByName(String id);
    
    public void deleteByID(String id);
    
    public void deleteAll();
    
}
