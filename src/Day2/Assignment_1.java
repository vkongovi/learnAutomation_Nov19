package Day2;

public class Assignment_1 {
    public static void main(String[] arg){
        //System.out.println("test");
        // write you
        System.out.println("Test");
        Animal Dog = new Animal("rocky",4);
        Animal Hamster = new Animal(3,"Syrian","pinwheel","brown");
        Animal parrot = new Animal();
        Dog.breed = "German Shepard";
        Dog.color = "Black/Brown";
        Dog.name = "Rocky";
        Dog.Move();
        Dog.Describe();
        Hamster.Describe();
        parrot.breed = "bird";
        parrot.name = "tweety";
        parrot.Age = 2;
        parrot.Move();
    }
}
