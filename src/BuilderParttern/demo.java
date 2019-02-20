/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderParttern;

/**
 *
 * @author dongnq
 */
public class demo {
    
    public static void main(String[] args) {
        Account account = new Account.Builder("1", "abc", "pass")
                .setAddress("Hung Vuong")
                .setEmail("a@gmail.com")
                .setPhone("123456789")
                .build();
        
        
        System.out.println("id: " + account.getId());
        System.out.println("username: " + account.getUsername());
        System.out.println("password: " + account.getPassword());
        System.out.println("email: " + account.getEmail());
        System.out.println("address: " + account.getAddress());
        System.out.println("phone: " + account.getPhone());
        
        
    }
    
}
