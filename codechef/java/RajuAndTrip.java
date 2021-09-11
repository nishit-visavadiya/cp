package codechef.java;

import java.util.Scanner;

public class RajuAndTrip {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 5 == 0 || n % 6 == 0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }

}
