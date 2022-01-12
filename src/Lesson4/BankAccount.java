package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount MyAccount= new BankAccount();
        BankAccount YourAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Salohiddin";
        MyAccount.balance=55.5;

        System.out.println("id="+MyAccount.id+" name="+ YourAccount.name);

    }
}

class BankAccountTest{


}