package random;

import java.util.Scanner;

public class Armstrong {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Armstrong armstrong = new Armstrong();
        System.out.println(armstrong.armstrong());
    }

    boolean armstrong()
    {
        int number = getInteger();
        int original = number;
        int sum = 0;

        while (number > 0)
        {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, 3);
            number = number / 10;
        }

        return original == sum;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
