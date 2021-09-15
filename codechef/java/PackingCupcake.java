package codechef.java;

import java.util.Scanner;

public class PackingCupcake {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        PackingCupcake packingCupcake = new PackingCupcake();
        packingCupcake.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfCupcakes = getInteger();
            System.out.println(getMaximumCupcake(numberOfCupcakes));
        }
    }

    int getMaximumCupcake(int numberOfCupcakes)
    {
        return numberOfCupcakes / 2 + 1;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
