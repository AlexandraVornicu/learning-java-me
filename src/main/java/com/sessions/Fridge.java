package com.sessions;

public class Fridge {
    private String brand;
    private int price;
    private int numberOfDoors;
    private String configuration;

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

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getConfiguration() {
        return configuration;
    }
    public void printAllDetails() {
        System.out.println("The " + getBrand() + " fridge is " + getConfiguration() + ", has " + getNumberOfDoors()
                + " doors and costs " + getPrice() + " lei." );
    }
}
