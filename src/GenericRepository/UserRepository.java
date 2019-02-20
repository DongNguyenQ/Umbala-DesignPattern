/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericRepository;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dongnq
 */
public abstract class UserRepository <T extends BaseEntityGR> implements BaseRepository<T>{
    
    private Set<T> entities = new HashSet<>();

    @Override
    public void remove(T entity){
        entities.remove(entity);
    }

    @Override
    public Set<T> get(){
        return Collections.unmodifiableSet(entities);
    }
    
    
    @Override
    public void persist(T entity) {
        entities.add(entity);
    }
    

    
    
    
    
}
