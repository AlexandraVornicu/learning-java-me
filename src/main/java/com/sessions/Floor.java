package com.sessions;

public class Floor {

    private String place;
    private String material;
    private String color;

    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void printAllDetails(){
        System.out.println("The floor from " + getPlace() + " has " + getColor() + " " + getMaterial() + ".");
    }
}
