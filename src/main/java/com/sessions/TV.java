package com.sessions;

public class TV {

    private String brand;
    private int price;
    private int size;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void printAllDetails() {
        System.out.println("The " + getBrand() + " TV is " + getSize() + " inch and costs " + getPrice() + " lei.");
    }

}
