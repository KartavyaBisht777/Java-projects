class Student {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class Ques9{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Creatine");
        System.out.println(s.getName());
    }
}