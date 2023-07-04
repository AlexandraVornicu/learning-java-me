package com.sessions;

public class MyApplication {

    public static void main(String[] args) {

        Bed livingBed = new Bed();
        livingBed.setPlace("living room");
        livingBed.setPrice(4500);
        livingBed.setSize("200x210");
        livingBed.setBrand("Ikea");
        livingBed.printAllDetails();

        Bed dormitoryBed = new Bed();
        dormitoryBed.setPlace("dormitory");
        dormitoryBed.setPrice(2900);
        dormitoryBed.setSize("160x200");
        dormitoryBed.setBrand("MobExpert");
        dormitoryBed.printAllDetails();

        TV myTV = new TV();
        myTV.setBrand("Samsung");
        myTV.setPrice(3000);
        myTV.setSize(27);
        myTV.printAllDetails();

        Fridge myFridge = new Fridge();
        myFridge.setBrand("Indesit");
        myFridge.setPrice(8000);
        myFridge.setNumberOfDoors(2);
        myFridge.setConfiguration("Freezer-on-Top");
        myFridge.printAllDetails();

        Stove myStove = new Stove();
        myStove.setBrand("Heinner");
        myStove.setPrice(1000);
        myStove.setColor("white");
        myStove.setType("electric");
        myStove.printAllDetails();

        Floor kitchenFloor  = new Floor();
        kitchenFloor.setPlace("kitchen");
        kitchenFloor.setColor("grey");
        kitchenFloor.setMaterial("tile");
        kitchenFloor.printAllDetails();

        Floor roomsFloor = new Floor();
        roomsFloor.setPlace("rooms");
        roomsFloor.setColor("light brown");
        roomsFloor.setMaterial("wood");
        roomsFloor.printAllDetails();

        Clock myClock = new Clock();
        myClock.setPlace("kitchen");
        myClock.setType("electric");
        myClock.setPrice(50);
        myClock.printAllDetails();

        Laptop myLaptop = new Laptop();
        myLaptop.setBrand("Apple");
        myLaptop.setSize(13);
        myLaptop.setPrice(6000);
        myLaptop.printAllDetails();


    }

}
