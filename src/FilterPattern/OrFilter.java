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
public class OrFilter implements Filter{
    
    private Filter filter1;
    private Filter filter2;

    public OrFilter(Filter filter1, Filter filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }


    @Override
    public List<Product> applyFilter(List<Product> products) {
        List<Product> productFilter1 = filter1.applyFilter(products);
        List<Product> productFilter2 = filter2.applyFilter(products);
        
        for (Product product : productFilter2) {
            if(!productFilter1.contains(product))
                productFilter1.add(product);
            else
                productFilter1.remove(product);
        }
        
        return productFilter1;
    }
    
}
