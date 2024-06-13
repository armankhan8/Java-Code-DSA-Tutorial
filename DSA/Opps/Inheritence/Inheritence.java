package DSA.Opps.Inheritence;
class Shape{
    String colors;
}
// Implement of Inheritence
class Circle extends Shape{
    public void print(){
        System.out.println(this.colors);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.colors = "Blue";
        cir.print();

    }   
}
