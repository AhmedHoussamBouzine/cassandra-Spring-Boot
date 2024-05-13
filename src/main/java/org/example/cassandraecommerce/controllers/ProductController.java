package org.example.cassandraecommerce.controllers;

import org.example.cassandraecommerce.entities.Product;
import org.example.cassandraecommerce.services.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping ("/products")
public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllUsers(){
        return productService.getAllProducts();
    }
    @PostMapping
    public String saveUser(@RequestParam String name, @RequestParam double price, @RequestParam int quantiteStock){

        productService.createProduct(name, price, quantiteStock);
        return "Product created successfully";

    }
    @GetMapping(path="/{id}")
    public Product getProdcutById(@PathVariable UUID id){
        return productService.getProductById(id);
    }


}
