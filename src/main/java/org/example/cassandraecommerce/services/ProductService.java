package org.example.cassandraecommerce.services;

import org.example.cassandraecommerce.entities.Product;
import org.example.cassandraecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public void createProduct (String name, double price, int quantiteStock){
        productRepository.save(new Product(UUID.randomUUID(), name, price, quantiteStock));
    }
    public Product getProductById (UUID uuid){
        return productRepository.findById(uuid).get();
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
