package codechef;

import java.util.Scanner;

public class BothOrNot {

    Scanner sc = new Scanner(System.in);

    void bothOrNot() {
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 11 == 0) {
            System.out.println("BOTH");
        } else if (n % 5 == 0 || n % 11 == 0) {
            System.out.println("ONE");
        }
        else {
            System.out.println("NONE");
        }
    }
}
