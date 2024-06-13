package DSA.Opps;
class Student{
    String name;
    static String scholl;

    public static void changeScl(){
        scholl = "NewSchl";
    }
}
public class Statics {
    public static void main(String[] args) {
        Student.scholl = "CS";
        Student st = new Student();
        st.name = "Arman";
        System.out.println(st.scholl);
    }
}
