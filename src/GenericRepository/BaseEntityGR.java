/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericRepository;

import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author dongnq
 */
public class BaseEntityGR {
    
    private final String id;

    public BaseEntityGR() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntityGR identity = (BaseEntityGR) o;
        return Objects.equals(id, identity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[id=" + id.substring(0,8) + "...]";
    }
    
}
