/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FilterPattern;

/**
 *
 * @author dongnq
 */
public class Product {
    
    private String id;
    private String name;
    private Double price;
    private String cate;
    private String origin;

    public Product() {
    }

    public Product(String id, String name, Double price, String cate, String origin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cate = cate;
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }
    
    
}
