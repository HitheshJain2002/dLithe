package problem1;

import static problem1.student.b.*;

public class Test  extends student{

    @Override
    void message() {
        System.out.println("wht us this behaviour...");
    }

    public static void main(String[] args) {
      Test t=new Test();
      t.message();


    }


}
