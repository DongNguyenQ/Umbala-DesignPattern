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
public class Account {
    
    private String id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;

    private Account(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.address = builder.address;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    
    
    
    
    public static class Builder {
        
        private String id;
        private String username;
        private String password;
        private String email;
        private String phone;
        private String address;


        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder(String id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }

        
        public Account build() {
            return new Account(this);
        }
        
        
    }
}
