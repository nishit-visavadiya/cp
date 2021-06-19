package codechef;

import java.util.Scanner;

public class SumOfLastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int first = 0, last = n % 10;
            while (n > 0) {
                first = n % 10;
                n /= 10;
            }
            System.out.println(first + last);
        }
    }
}
