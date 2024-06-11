package onlyOneObject.SingleTimeDesignPattern;

public class Account {
    private static Account ac;
    private Account(){
        System.out.println("object created");
    }
    public static void createObject(){
        if(ac==null){
            ac=new Account();

        }
    }
}
