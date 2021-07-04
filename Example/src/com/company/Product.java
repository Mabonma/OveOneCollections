package com.company;

public class Product {
    private int id;
    static private int idCount = 0;
    private String name, category;
    private double price, discount, actualPrice;

    public Product(String name, String category, double price, double discount) {
        id = idCount++;
        this.discount = discount;
        this.name = name;
        this.category = category;
        this.price = price;
        actualPrice = price - price * (discount / 100);
    }

    public Product(String name, String category, double price) {
        id = idCount++;
        this.name = name;
        this.category = category;
        this.price = price;
        actualPrice = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        actualPrice = price - price * (discount / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void Print(){
        System.out.println("ID - " + id);
        System.out.println("Name - " + name);
        System.out.println("Price - " + price);
        System.out.println("Category - " + category);
        System.out.println("Discount - " + discount);
        System.out.println("Actual price - " + actualPrice);
    }
}
