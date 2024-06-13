package DSA.Opps;
class Pen{
    String color;
    String type;
    String brand;

    public void write(){
        System.out.println("Writing something..!");
    }
    public void PrintAll(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.brand);
    }
}
// Formationn of class 
class StudentA{
    String name;
    String rollN;
    int age;
    
    public void PrintInfor(){
        System.out.println("Name of student: " + this.name);
        System.out.println("Roll Num: " + this.rollN);
        System.out.println("Age: " + this.age);
    }
    // StudentA(){
    //     //Non - Parameterzed constructor
    //     System.out.println("Constructor!!");
    // }
    
    // Parametezed constructor pass arguments
    StudentA(String name, int age){
        this.name = name; // this.name --> object name 
        this.age = age;
    }
}

public class ExamplePen {
    public static void main(String args[]){
        Pen pen1 = new Pen();  //Pen() --> Constructor pen1 --> object of the class
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.brand = "doms";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpen";
        pen2.brand = "doms";
        // pen1.write();

        // pen1.PrintAll();
        // pen2.PrintAll();

        StudentA st = new StudentA("Arman", 20);
        // st.name = "Arman";
        // st.rollN = "009";
        st.age = 20;

        st.PrintInfor();

    }
}
