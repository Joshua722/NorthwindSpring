package com.pluralsight;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SimpleProductDAO implements ProductDAO{
private List<Product> products = new ArrayList<>();

    public SimpleProductDAO(List<Product> products) {
        this.products = products;
    }


    @Override
    public void add(Product product) {
    products.add(product);
    }

    @Override
    public List<Product> getAll() {
        for(Product p : products){
            System.out.println(products);
        }
    return new ArrayList<>(products);
    }
}
