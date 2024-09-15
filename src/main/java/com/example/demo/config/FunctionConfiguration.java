package com.example.demo.config;

import com.example.demo.Entity.Product;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import java.util.function.Function;

@AllArgsConstructor
@Configuration
public class FunctionConfiguration {

    private final ProductService productService;

    public record ProductName(String name) {
    }

    public record ProductDetails(int id, String name, int price, int quantity){

    }

    @Bean
    @Description("Get product details by name")
    public Function<ProductName, ProductDetails > getProductDetails() {
        return productName -> {
            Product product = productService.findProductByName(productName.name());
            if (product != null) {
                return new ProductDetails(product.getId(),product.getName(),product.getPrice(),product.getQuantity());
            } else {
                return new ProductDetails(0, "Not Found", 0, 0);
            }
        };
    }

}
