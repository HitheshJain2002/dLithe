package ObjectClass;

import java.util.Objects;

public class Employee extends object {
    int a;

    Employee(int a) {
        this.a = a;
    }

    public class student1 implements ObjectClass.student1 {
        String name;

        void Student1(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            return a + "hello" + "";
        }

        @Override
        public int hashcode() {
            return 123;
        }

        @Override
        public boolean equal(object o) {
            student1 s = (student1) o;
            return Objects.equals(this.name, s.name);

        }

        public static void main(String[] args) {


            Employee e = new Employee(7);
            System.out.println(e);
            System.out.println(e.hashcode());


        }
    }
}