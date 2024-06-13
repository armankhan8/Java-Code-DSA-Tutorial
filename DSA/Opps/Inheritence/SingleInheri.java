package DSA.Opps.Inheritence;
class Shape {
    public void area() {
        System.out.println("Display Area: ");
    }
}

class Triangle extends Shape {
    public void area(int h, int l) {
        System.out.println(0.5 * h * l);
    }
}

public class SingleInheri {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();

        Triangle t = new Triangle();
        t.area(2, 3); // Calls the area method from the Triangle class with arguments
    }
}
