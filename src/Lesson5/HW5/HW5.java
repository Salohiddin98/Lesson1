package Lesson5.HW5;

class BAccount{
   double balance=100;
    double plus(double a){
         balance+=a;
         return balance;
    }
    double minus(double a){
        balance-=a;
        return balance;
    }
    void show(){
        System.out.println(balance);
    }

    
}

public class HW5 {

    public static void main(String[] args) {
    BAccount q = new BAccount();
    q.show();
    q.plus(0.5);
    q.show();
    q.minus(1);
    q.show();

    }
    }




