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
public class demo {
    
    
    public static void main(String[] args){
        List<Product> allProduct = new ArrayList<Product>();
        
        allProduct.add(new Product("1", "iphone", 500.000, "phone", "american"));
        allProduct.add(new Product("2", "Ao so mi", 200.000, "clothes", "japan"));
        allProduct.add(new Product("3", "samsung s8", 900.000, "phone", "japan"));
        allProduct.add(new Product("4", "Quan Jean", 300.000, "clothes", "american"));
        allProduct.add(new Product("5", "Quan tay", 100.000, "clothes", "korean"));
        allProduct.add(new Product("6", "india phone", 150.000, "phone", "india"));
        
        Filter americanOriginProduct = new AmericanOriginFilter();
        Filter phoneCateProduct = new PhoneCateFilter();
        Filter phoneCateAndAmericanOriginProduct = new AndFilter(americanOriginProduct, phoneCateProduct);
        Filter phoneCateOrAmericanFilterProduct = new OrFilter(phoneCateProduct, americanOriginProduct);
        
        
        
        System.out.println("Product from american");
        showProduct(americanOriginProduct.applyFilter(allProduct));
        System.out.println("=================================================");
        System.out.println("Product is phone");
        showProduct(phoneCateProduct.applyFilter(allProduct));
        System.out.println("=================================================");
        System.out.println("Product is phone and from American");
        showProduct(phoneCateAndAmericanOriginProduct.applyFilter(allProduct));
        System.out.println("=================================================");
        System.out.println("Product is phone or from American");
        showProduct(phoneCateOrAmericanFilterProduct.applyFilter(allProduct));
        
        
    }
    
    public static void showProduct(List<Product> products){
   
      for (Product product : products) {
         System.out.println("Product : [ ID : " + product.getId() + 
                            ", NAME : " + product.getName() + 
                            ", CATEGORY : " + product.getCate() + 
                            ", PRICE : " + product.getPrice()+ 
                            ", ORIGIN : " + product.getOrigin()+ 
                            " ]");
      }
   }      
}
