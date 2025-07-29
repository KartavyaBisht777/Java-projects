class SuperClass {
    void show() {
        System.out.println("Show from SuperClass");
    }
}

class SubClass extends SuperClass {
    void show() {
        super.show();
        System.out.println("Show from SubClass");
    }
}

public class Ques8 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.show();
    }
}