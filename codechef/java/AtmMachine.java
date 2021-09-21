package codechef.java;

import java.util.Scanner;

public class AtmMachine {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfPeople = getInteger();
            int moneyInAtm = getInteger();

            int[] people = getArray(numberOfPeople);

            System.out.println(personCanWithdrawAmount(numberOfPeople, moneyInAtm, people));
        }
    }

    String personCanWithdrawAmount(int numberOfPeople, int moneyInAtm, int[] people)
    {
        String result = "";
        for (int i = 0; i < numberOfPeople; i++)
        {
            if (moneyInAtm >= people[i])
            {
                moneyInAtm = moneyInAtm - people[i];
                result += "1";
            }
            else
                result += "0";
        }

        return result;
    }

    int[] getArray(int size)
    {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = getInteger();
        }

        return arr;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
