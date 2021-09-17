package codechef.java;

import java.util.Scanner;

public class Rectangle {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int a = getInteger();
            int b = getInteger();
            int c = getInteger();
            int d = getInteger();

            if (isRectangle(a, b, c, d))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    boolean isRectangle(int a, int b, int c, int d)
    {
        return (a == b && c == d) || (a == c && b == d) || (a == d && b == c);
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
