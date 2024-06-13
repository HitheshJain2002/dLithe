package LinkedList;

import java.util.LinkedList;

public class STUDENT {
    int id;
    String name;
    public STUDENT(int id,String Name){
        this.id=id;
        this.name=Name;
    }
    public

    String toString(){
        return "ID:"+id+"| name:"+name;
    }

    public static void main(String[] args) {
        LinkedList<STUDENT> l=new LinkedList();
        STUDENT s1=new STUDENT(101,"VIRAT");
        STUDENT s2=new STUDENT(102,"ROHITH");
        System.out.println(  s1.toString());;

    }
}
