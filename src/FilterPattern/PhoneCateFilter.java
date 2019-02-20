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
public class PhoneCateFilter implements Filter{

   

    @Override
    public List<Product> applyFilter(List<Product> products) {
        List<Product> phoneProduct = new ArrayList<Product>();
        for (Product product : products) {
            if(product.getCate().equalsIgnoreCase("phone"))
                phoneProduct.add(product);
        }
        return phoneProduct;
    }
    
}
