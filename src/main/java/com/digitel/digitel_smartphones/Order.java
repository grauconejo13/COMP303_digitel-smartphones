package com.digitel.digitel_smartphones;

//Vanessa Victorino - 301201653
//01OCT24

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


public class Order {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String brand;
    private String model;
    private double price;
    private int quantity;

    // Getters and Setters
    @NotBlank(message = "Name cannot be blank!")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Email(message = "Invalid email address!")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @NotBlank(message = "Phone Number cannot be blank!")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    @NotBlank(message = "Street Address cannot be blank!")
    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Min(value = 1, message = "Quantity must be at least 1")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }
}
