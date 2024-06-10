package PACK1;


import java.util.Scanner;

public class testENCAP {
    public static void main(String[] args) {


        ENCAP e = new ENCAP();
        employee em=new employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ID and NAME  and Salary:");
        em.setID(sc.nextInt());
        em.setName(sc.next());
        em.setSalary(sc.nextInt());


        System.out.println("the Entered ID and NAME  and Salary: " + em.getID()+" ,"+em.getName()+" ,"+em.getSalary());
    }
}