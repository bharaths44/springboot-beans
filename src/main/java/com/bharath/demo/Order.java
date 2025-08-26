package com.bharath.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    @JsonProperty("c-name")
    private String customerName;

    @JsonProperty("p-name")
    private String productName;

    @JsonProperty("quantity")
    private int quantity;

    // should match the JSON property name
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
