package PACK1;

public class employee {


        private int ID;
        private String name;
        private int salary;


    protected void setID(int ID){
        if(ID<100){
            System.out.println("invalid ID");return;
        }
        this.ID=ID;
    }
    public int getID(){
        return  this.ID;
    }
    protected  void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    protected void setSalary(int salary){
        if(salary<2000){
            System.out.println("faulut in salary");
            return;
        }
        this.salary=salary;
    }
    public int getSalary(){
        return  this.salary;
    }

}
