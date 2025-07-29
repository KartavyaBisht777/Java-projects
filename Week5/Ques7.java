class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void greet() {
        System.out.println("Hello from Child");
    }
}

public class Ques7 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.greet(); 
    }
}