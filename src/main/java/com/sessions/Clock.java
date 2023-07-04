package com.sessions;

public class Clock {

    private String place;
    private String type;
    private int price;

    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void printAllDetails() {
        System.out.println("The clock from " + getPlace() + " is " + getType() + " and costs " + getPrice() + " lei." );
    }
}
