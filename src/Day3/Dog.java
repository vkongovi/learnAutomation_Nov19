package Day3;

public class Dog extends Animal {
    String dog_age;
    String dog_name;

    public void Move(){
        super.Move();
        System.out.println("I am a "+this.breed+" and I move at 10 mph");
    }
    public void dogMethod(){

    }
}
