package DSA.Opps;
class Student{
    String name;
    int age;
    float RollN;

// Polymorphism 
    public void PrintInf(String name){
        System.out.println(name);
    }
    public void PrintInf(int age){
        System.out.println(age);
    }
    public void PrintInf(float RollN){
        System.out.println(RollN);
    }
    // public void PrintInf(String name, int age, float rollN){
        // System.out.println(name + " " + age + " " + rollN);
    // }
    public void PrintInf(String name, int age){
        System.out.println(name + " " + age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student st = new Student();
        st.age = 22;
        st.name = "Arman";
        // st.RollN = 9.0;
        st.PrintInf(st.name = "Arman", 22);
    }
}
