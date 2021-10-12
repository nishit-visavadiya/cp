package codechef.java;

import java.util.Scanner;

public class PackingCupcake {

    Scanner sc = new Scanner(System.in);

    int numberOfCupcakes;

    public static void main(String[] args)
    {
        PackingCupcake packingCupcake = new PackingCupcake();
        packingCupcake.execute();
    }

    void execute() {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            numberOfCupcakes = getInteger();
            System.out.println(getMaximumCupcake());
        }
    }

    int getMaximumCupcake()
    {
        return numberOfCupcakes / 2 + 1;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
