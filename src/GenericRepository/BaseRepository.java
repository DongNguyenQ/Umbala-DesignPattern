/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericRepository;

import java.util.Optional;
import java.util.Set;

/**
 *
 * @author dongnq
 * @param <T>
 */
public interface BaseRepository<T extends BaseEntityGR>{
    
    default Optional<T> get(String id){
        return get().stream().filter(entity -> entity.getId().equals(id)).findAny();
    }

    Set<T> get();

    void remove(T entity);
    
    void persist(T entity);
    
}
