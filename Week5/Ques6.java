class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts");
    }
}

public class Ques6 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start(); 
    }
}