package codechef;

import java.util.*;

public class Atm {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        double balance = sc.nextDouble();

        if (amount % 5 == 0 && amount + 0.50 < balance) {
            balance = balance - (amount + 0.50);
            System.out.println(balance);
        } else {
            System.out.println(balance);
        }
        sc.close();
    }

}
