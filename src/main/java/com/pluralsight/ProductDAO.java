package com.pluralsight;

import java.util.List;

public interface ProductDAO {
    public void add(Product product);
    public List<Product> getAll();
}
