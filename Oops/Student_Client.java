public class Student_Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Sachin";
        st1.age = 20;
        st1.Intro_yourSelf();
        Student st2 = new Student();
        st2.name = "Ravi";
        st2.age = 20;
        st2.Intro_yourSelf();
        st1.SayHey("Ravi");
        st2.SayHey("Sachin");
        st1.fun();
    }
    static{
        System.out.println("Hello All");
    }
}
