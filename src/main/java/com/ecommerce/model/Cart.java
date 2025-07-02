//package com.ecommerce.model;
//
//
//import com.ecommerce.repository.CustomerRepository;
//import jakarta.persistence.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//
//@Entity
//@Component
//public class Cart {
//    @Id
//    @GeneratedValue
//   private int id;
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public List<CartItem> getCartItem() {
//        return cartItem;
//    }
//
//    public void setCartItem(List<CartItem> cartItem) {
//        this.cartItem = cartItem;
//    }
//
//    @OneToOne
//   private Customer customer;
//
//    @OneToMany
//    private List<CartItem> cartItem=new ArrayList<>();
//
//}
