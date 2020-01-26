package com.company;

import Day2.Animal;

public class Entry {

    public static void main(String[] args) {
      //  System.out.println("Test demo");
      //  int x = Add(3,4);
       // System.out.println("Sum of 3 and 4 is " + x);

        int i = 1;

/*        Car vinodCar = new Car("Red","Polo","VW");
        Car tahirCar = new Car("White","A4", "Audi");
        Car rupaliCar = new Car("Black", "M3", "BMW");
*/
        //Car c1 = new Car();
        //Day2.Car c2 = new Day2.Car();

       // Animal a = new  Animal();
       // Animal a1 = new  Animal();
       // Animal a2 = new  Animal();




        Car vinodCar = new Car();
        Car tahirCar = new Car("white");
        Car rupaliCar = new Car();

        vinodCar.color = "Red";
        vinodCar.brand = "VW";
        vinodCar.model = "Polo";
        tahirCar.color = "White";
        tahirCar.brand = "Audi";
        tahirCar.model = "A4";
        rupaliCar.color = "Black";
        rupaliCar.brand = "BMW";
        rupaliCar.model = "M3";

        vinodCar.Start();
        tahirCar.Start();
        rupaliCar.Start();




    }

    public static int Add(int a, int b){
        return a+b;
    }
}