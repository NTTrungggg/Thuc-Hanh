package com.example.recycler_view_example;

public class Laptop {
    private int imageUrl;
    private String name;
    private String specs;
    private double price;
    private float rating;

    public Laptop(int imageUrl, String name, String specs, double price, float rating) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.specs = specs;
        this.price = price;
        this.rating = rating;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
