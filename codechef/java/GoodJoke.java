package codechef.java;

import java.util.Scanner;

public class GoodJoke {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        GoodJoke goodJoke = new GoodJoke();
        goodJoke.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfPoint = getInteger();

            System.out.println(calculateTheAnswer(numberOfPoint));
        }
    }

    int calculateTheAnswer(int numberOfPoints)
    {
        int answer = 0;

        for (int i = 0; i < numberOfPoints; i++)
        {
            int pointOne = getInteger();
            int pointTwo = getInteger();
        }

        for (int i = 1; i <= numberOfPoints; i++)
        {
            answer ^= i;
        }

        return answer;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
