package DSA.Opps;
abstract class Animal{
    abstract void walk();
    Animal(){
        // Constructor
        System.out.println("Created Animal Construcute");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Creating horse constructor");
    }
    public void walk(){
        System.out.println("Walk on 4 Legs!");
    }
}
class Cat extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken");
    }
}
public class Abstruction {
    public static void main(String[] args) {
        Horse hor = new Horse();
        hor.walk();
        Cat c = new Cat();
        c.walk();
    }
}
