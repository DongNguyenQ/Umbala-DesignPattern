/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dongnq
 */
public class AmericanOriginFilter implements Filter{

    @Override
    public List<Product> applyFilter(List<Product> products) {
        List<Product> americanProduct = new ArrayList<Product>();
        
        for (Product product : products) {
            if(product.getOrigin().equalsIgnoreCase("american"))
                americanProduct.add(product);
        }
        
        return americanProduct;
    }
    
}
