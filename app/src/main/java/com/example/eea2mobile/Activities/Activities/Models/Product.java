package com.example.eea2mobile.Activities.Activities.Models;
import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("pid")
    private int pid;
    @SerializedName("name")
    private String name;
    @SerializedName("categoryId")
    private int categoryId;
    @SerializedName("price")
    private double price;
    @SerializedName("quantity")
    private int quantity;
    @SerializedName("imageUrl")
    private String imageUrl;

    public Product() {
    }

    public Product(int pid, String name, int categoryId, double price, int quantity, String imageUrl) {
        this.pid = pid;
        this.name = name;
        this.categoryId = categoryId;
        this.price = price;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
