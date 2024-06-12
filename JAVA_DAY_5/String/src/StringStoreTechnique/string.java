package StringStoreTechnique;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

String s="nigga";
 s="hithansh";
        System.out.println(s);
        StringBuilder str=new StringBuilder(44);
        System.out.print("enter the String NAMES:");
        for (int i = 0; i <2; i++) {
            str.append(sc.nextLine()+" ");
        }
        str.deleteCharAt(3);
        str.compareTo(new StringBuilder("str2"));
        str.reverse();
        System.out.println();
        System.out.println(str+" ");



    }
}
