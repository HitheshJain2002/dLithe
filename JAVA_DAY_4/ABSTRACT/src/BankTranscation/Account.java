package BankTranscation;

import BankTranscation.ATM;
import BankTranscation.bank;

import java.util.Scanner;

public class Account{
    public static void main(String[] args) {
        bank a = new ATM();
        Scanner sc =new Scanner(System.in);
        while(1!=0){
            System.out.println("Welcome to ATM\n 1.Deposit \n 2.Withdraw\n 3.Checkbalance\n 4.Exit\n Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    int amount1 = sc.nextInt();
                    a.deposit(amount1);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    int amount2 = sc.nextInt();
                    a.withdraw(amount2);
                    break;
                case 3:
                    a.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you visit again");
                    System.exit(0);
                    sc.close();
                default:

                    break;
            }
        }
    }
}
