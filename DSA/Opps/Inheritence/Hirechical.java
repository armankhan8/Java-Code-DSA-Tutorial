package DSA.Opps.Inheritence;
class Shape{
    public void area() {
        System.out.println("Display Area: ");
    }
}
class Triangle extends Shape {
    public void area(int h, int l) {
        System.out.println(0.5 * h * l);
    }
}
class Circle extends Shape{
    public void area(int h, int r){
        System.out.println(3.14 * r*h);
    }
}
public class Hirechical {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.area(3, 3);
    }
}
