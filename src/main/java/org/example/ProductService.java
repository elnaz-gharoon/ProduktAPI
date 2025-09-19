package org.example;

import java.util.List;

public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<product>getProducts() {
        return productRepository.findAll();
    }

    public product saveProduct(product product) {
        return productRepository.save(product);

    }
}
