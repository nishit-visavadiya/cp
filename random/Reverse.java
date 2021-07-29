package random;

import java.util.Scanner;

public class Reverse {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Reverse reverse = new Reverse();
        System.out.println(reverse.reverseTheNumber());
    }

    int reverseTheNumber()
    {
        int reverse = 0;
        int n = getInteger();

        while(n > 0)
        {
            int lastDigit = n % 10;
            reverse = reverse*10 +lastDigit;
            n = n/10;
        }

        return reverse;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
