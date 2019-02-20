/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterPattern;

import java.util.List;

/**
 *
 * @author dongnq
 */
public interface Filter {
    public List<Product> applyFilter(List<Product> products);
}
