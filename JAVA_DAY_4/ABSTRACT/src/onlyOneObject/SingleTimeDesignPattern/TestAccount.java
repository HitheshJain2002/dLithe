package onlyOneObject.SingleTimeDesignPattern;

public class TestAccount {
    public static void main(String[] args) {
        Account.createObject();
        Account.createObject();
        Account.createObject();

    }
}
