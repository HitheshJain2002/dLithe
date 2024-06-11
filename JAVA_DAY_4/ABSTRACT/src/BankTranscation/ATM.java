package BankTranscation;

public class ATM implements bank{
    public int balance;
    @Override
    public void withdraw(int amount){
        balance -= amount;
        System.out.println("The available balance after withdraw of "+amount+" is : "+balance);
    }
    @Override
    public void deposit(int amount){
        balance+=amount;
        System.out.println("The balance after deposit of "+amount+" is : "+balance);

    }
    @Override
    public void checkBalance(){
        System.out.println("The balance is :"+balance);
    }
}
