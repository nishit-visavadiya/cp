package codechef.java;

import java.util.Scanner;

public class ValidTriangles {

    Scanner sc = new Scanner(System.in);

    int a, b, c;

    public static void main(String[] args)
    {
        ValidTriangles validTriangles = new ValidTriangles();
        validTriangles.executeTestCases();
    }

    void executeTestCases() {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            System.out.println(triangleIsValid());
        }
    }

    String triangleIsValid()
    {
        if (sumOfAnglesAreEqualTo())
            return "YES";
        else
            return "NO";
    }

    boolean sumOfAnglesAreEqualTo()
    {
        return a + b + c == 180;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
