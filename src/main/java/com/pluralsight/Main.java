package com.pluralsight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        SimpleProductDAO simpleProductDAO = ctx.getBean(SimpleProductDAO.class);
        System.out.println("""
                1) List Products
                2) Add Products
                """);
        String input = myScanner.nextLine();
        switch(input){
            case "1": List<Product> productList = simpleProductDAO.getAll();
                break;
            case "2":
                System.out.println("Enter product name:");
                String productName = myScanner.nextLine();
                Product newProduct = new Product(productName);
                simpleProductDAO.add(newProduct);
                break;
        }
    }
}
