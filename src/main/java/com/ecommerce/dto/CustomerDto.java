package com.ecommerce.dto;

public class CustomerDto {
    private String username;
//    private String email;
    private String password;

    public String getUsername() {
        System.out.println("1"+username);
        return username;
    }

    public void setUsername(String username) {
        System.out.println("2"+username);
        this.username = username;
    }

    //    public String getEmail() {
//        return email;
//    }

//    public void setEmail(String email) {
//        this.email = email;
//    }

    public String getPassword() {
        System.out.println("p1"+password);

        return password;
    }

    public void setPassword(String password) {

        System.out.println("p2"+password);
        this.password = password;
    }
}
