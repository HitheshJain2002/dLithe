package interface1;

public class student implements employee {
    int a = 9; // This is an instance variable, different from the static final 'a' in the interface.

    @Override
    public void display() {
        System.out.println("hello");
    }

    void display1() {
        System.out.println("world");
    }

    public static void main(String[] args) {
        student s = new student();

        s.display();
        s.display1();
        System.out.println(s.a);
        System.out.println(employee.a); // Accessing the static final variable from the interface.
    }
}
