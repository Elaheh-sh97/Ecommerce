//package com.ecommerce.service;
//
//
//import com.ecommerce.dto.ProductDto;
//import com.ecommerce.model.Cart;
//import com.ecommerce.model.CartItem;
//import com.ecommerce.model.Customer;
//import com.ecommerce.model.Products;
//import com.ecommerce.repository.CartItemRepository;
//import com.ecommerce.repository.CartRepository;
//import com.ecommerce.repository.CustomerRepository;
//import com.ecommerce.repository.ProductRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class CartService {
//
//
//    @Autowired
//    private ProductRepository productRepo;
//    @Autowired
//    private CartRepository cartRepo;
//    @Autowired
//    private CartItemRepository cartItemRepo;
//    @Autowired
//    private CustomerRepository customerRepo;
//
//    public void addToCart(ProductDto productdto,String name){
//
//        Optional<Customer> customer= Optional.of(customerRepo.findByUsername(name).orElse(new Customer("Unknown")));
//
//        Optional<Products> product=
//                Optional.of(productRepo.findById(productdto.getProductId())).orElseThrow();
//
//        Cart newcart=new Cart();
//        if(customer.isPresent()){
//            newcart.setCustomer(customer.get());
//            cartRepo.save(newcart);
//        }
//
//        CartItem cartItem=new CartItem();
//        cartItem.setProduct(product.get());
//        cartItem.setCart(newcart);
//        newcart.getCartItem().add(cartItem);
////        cartItemRepo.save(cartItem);
//
//
//
//
//    }
//
//
//}
