package com.razorpay.apiimplemenctionjava;

import java.util.List;

public class Product {
    private final String brand;
    private final String category;
    private final String description;
    private final double discountPercentage;
    private final int id;
    private final List<String> images;
    private final int price;
    private final double rating;
    private final int stock;
    private final String thumbnail;
    private final String title;

    public Product(String brand, String category, String description, double discountPercentage, int id, List<String> images, int price, double rating, int stock, String thumbnail, String title) {
        this.brand = brand;
        this.category = category;
        this.description = description;
        this.discountPercentage = discountPercentage;
        this.id = id;
        this.images = images;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
        this.thumbnail = thumbnail;
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public int getId() {
        return id;
    }

    public List<String> getImages() {
        return images;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getStock() {
        return stock;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }
}
