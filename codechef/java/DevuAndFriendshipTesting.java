package codechef.java;

import java.util.Arrays;
import java.util.Scanner;

public class DevuAndFriendshipTesting {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        DevuAndFriendshipTesting friendshipTesting = new DevuAndFriendshipTesting();
        friendshipTesting.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfFriends = getInteger();
            int[] friends = getArray(numberOfFriends);

            System.out.println(maximumNumberOfFriendsThatHeCanSave(numberOfFriends, friends));
        }
    }

    int maximumNumberOfFriendsThatHeCanSave(int numberOfFriends, int[] friends)
    {
        Arrays.sort(friends);
        int[] commonElements = new int[numberOfFriends];
        
        int j = 0;
        for (int i = 0; i < numberOfFriends - 1; i++)
        {
            if (friends[i] != friends[i + 1])
            {
                commonElements[j] = friends[i];
                j++;
            }
        }

        commonElements[j++] = friends[numberOfFriends - 1];

        return j;
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
