package Day3;

import Day4.Monkey;

public class Entry3 {
    public static void main(String[] arg) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Animal a2 = new Dog(); //forward inheritance
        //Dog d2 = (Dog) new Animal();  //cannot try to create an object referencing to parent
        //d2 is an instance of Dog class
        specialDog spl_dog = new specialDog();
        //specialDog sp2 = (specialDog) new Dog();
        //sp2 is an instance of specialDog
        //specialDog sp3 = (specialDog) new Animal();
        //sp3 is an instance of specialDog;
        Monkey m1 = new Monkey();// from Day4 package; check for import statement above
        //cannot access the properties of monkey defined as protected - age variable
        System.out.println("Value of a public variable from another package"+m1.age_pub);

        a1.breed = "Hyena";
        a1.Move();
        d1.breed = "Wolf";
        d1.Move();
        spl_dog.breed = "Doberman";
        spl_dog.Move();
        Method1(a1);
        Method1(spl_dog); //allowed -  as spl_dog and d1 are child of Animal - like back version support/compatibility
        Method1(d1);
        Method2(d1);
       // Method2(a1); -- not possible as it accepts a child class object - which may or may not have more properties
        //and variables
    }

        public static void Method1(Animal a){
            System.out.println("Method1 :: "+a.breed);
        }

        public static void Method2(Dog d){
            System.out.println("Method2 :: "+d.breed);
        }

}
