public class person {
    String name = "ravi";
    int age=19;
    public void Intro_yourSelf(){
        System.out.println("My name is "+ name + " and age is "+ age);
    }
    // constructor
    public person(int age, String name){
        this.age = age;
        this.name = name;
    }
}
