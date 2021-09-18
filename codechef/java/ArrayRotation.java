package codechef.java;

import java.util.Scanner;

public class ArrayRotation {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayRotation arrayRotation = new ArrayRotation();
        arrayRotation.execute();
    }

    void execute()
    {
        int sizeOfArray = getInteger();
        long sum = 0;
        long MOD = 1000000007;
        while (sizeOfArray --> 0)
        {
            long num = getLong();
            sum += num;
            sum = ((sum % MOD) + MOD) % MOD;
        }

        long q = getLong();
        while (q --> 0)
        {
            long x = getLong();
            sum += sum;
            sum = ((sum % MOD) + MOD) % MOD;
            System.out.println(sum);
        }
    }

    long getLong()
    {
        return sc.nextLong();
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
