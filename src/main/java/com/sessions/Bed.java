package com.sessions;

public class Bed {

    private String place;
    private String brand;
    private int price;
    private String size;
    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void printAllDetails() {
        System.out.println("The bed from " + getPlace() + " has " + getSize() + ", costs " + getPrice()
                + " lei and is from " + getBrand() + ".");
    }

}
