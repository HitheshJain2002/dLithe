package access;

public class TEST_ACCESS extends ACCESS{
    public static void main(String[] args) {
       ACCESS a =new ACCESS();
        System.out.println(a.age);
        System.out.println(a.name);
        a.display();
    }
}

