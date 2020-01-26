package com.company;

import javax.swing.*;

public class Animal {
    int age;
    String breed;
    String name;
    String color;

    public void Move(){
        if ((this.breed).equals("bird"))
            System.out.println("I am a "+this.breed+" and I fly");
        else
            System.out.println("I am a "+this.breed+" and I run");

    }

    public void Describe(){
        System.out.println("I am a "+this.breed+" of age "+this.age+" and "+this.color+" in color"+" and my name is "+this.name);

    }

    public Animal() {
        System.out.println("Default constructor no parameters");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(int age, String breed, String name, String color) {
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.color = color;
    }

}