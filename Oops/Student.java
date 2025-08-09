public class Student {
    String name = "ravi";
    int age=19;
    public void Intro_yourSelf(){
        System.out.println("My name is "+ name + " and age is "+ age);
    }
    public void SayHey(String name){
        System.out.println(name+ " Say hey "+ this.name);
    }
    public static void fun(){
        System.out.println("I am In fun");
    }
    static{
        System.out.println("Hay All Welcome To Coding Block ");
    }
}
