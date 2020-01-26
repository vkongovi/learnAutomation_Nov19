package Day2;

public class Animal {
    int Age;
    String breed;
    String name;
    String color;

    //final String breed = "Dog";

    // Global variable
   // String name;

     Animal() {
        System.out.println("Default constructor no parameters");
    }
    Animal(String name,int age){
        this.name=name;
        this.Age=age;
    }

    Animal(int age,String breed,String name,String color){
        this.Age=age;
        this.breed=breed;
        this.name=name;
        this.color=color;
    }

    public void Move(){
        if ((this.breed).equals("bird"))
            System.out.println("I am a "+this.breed+" and I fly");
        else
            System.out.println("I am a "+this.breed+" and I run");
    }

    public void Describe(){
        System.out.println("I am a "+this.breed+" of age "+this.Age+" and "+this.color+" in color"+" and my name is "+this.name);
    }

    public void Method1(){
        // breed = "parrot";
        // local variable
        int age = 0;
        name = name + "abc";
        age = age + 30;

    }

    public void Method2(){
        name = name + "xyZ";
        //age = age + 50;
    }
}
