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
public class AndFilter implements Filter{
    
    private Filter filter1;
    private Filter filter2;

    public AndFilter(Filter filter1, Filter filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    @Override
    public List<Product> applyFilter(List<Product> products) {
        List<Product> productFilter1 = filter1.applyFilter(products);
        return filter2.applyFilter(productFilter1);
    }
    
    
}
