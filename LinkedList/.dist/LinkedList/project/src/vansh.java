package project.src;

import project.src.package1.MyClass; // Importing AnotherClass from package2

public class vansh {
    public static void main(String[] args) {
        MyClass anotherObj = new MyClass();
        anotherObj.myMethod(); // Calls MyClass.myMethod() through AnotherClass
    }
}



