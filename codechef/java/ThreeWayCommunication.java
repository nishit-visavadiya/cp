package codechef.java;

import java.util.Scanner;

public class ThreeWayCommunication {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        ThreeWayCommunication tWY = new ThreeWayCommunication();
        tWY.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int r = getInteger();

            int x1 = getInteger();
            int y1 = getInteger();
            int x2 = getInteger();
            int y2 = getInteger();
            int x3 = getInteger();
            int y3 = getInteger();

            if (isCommunicate(r, x1, y1, x2, y2, x3, y3))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }

    boolean isCommunicate(int r, int x1, int y1, int x2, int y2, int x3, int y3)
    {
        int count = 0;

        if (squaredDistance(x1, y1, x2, y2) <= r * r)
            count++;
        if (squaredDistance(x1, y1, x3, y3) <= r * r)
            count++;
        if (squaredDistance(x2, y2, x3, y3) <= r * r) {
            count++;
        }

        return count >= 2;
    }

    int squaredDistance(int x1, int y1, int x2, int y2)
    {
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
