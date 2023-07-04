package com.sessions;

public class Stove {

    private String brand;
    private int price;
    private String color;
    private String type;
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

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void printAllDetails(){
        System.out.println("The " + getBrand() + " " + getColor() + " stove is " + getType() + " and costs "
                + getPrice() + " lei.");
    }
}
