package com.company;


// Test comments

public class Car {
    String color;
    int yearOfMfg;
    int noOfWheels;
    String ownerName;
    String brand;
    String model;
    String abc;

    public Car(){
        System.out.println("Constructor 1 Called");
    }

    public Car(String abc){
        System.out.println("Constructor 2 Called");
    }

    public  Car(String color, String model, String brand){
        this.color = color;
        this.model = model;
        this.brand = brand;
    }


    public void Start(){
        System.out.println("I am a " + brand + " " + model + " car. I am starting  now");
    }

    public void TurnRight(){

    }

    public void TurnLeft(){

    }

    public void Stop(){

    }
}
