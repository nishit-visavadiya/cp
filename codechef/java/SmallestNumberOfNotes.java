package codechef.java;

import java.util.Scanner;

public class SmallestNumberOfNotes {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        SmallestNumberOfNotes sn = new SmallestNumberOfNotes();
        sn.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases -- > 0)
        {
            int numberOfNotes = getInteger();
            System.out.println(smallestNumberOfNotes(numberOfNotes));
        }
    }

    int smallestNumberOfNotes(int numberOfNotes)
    {
        int sum = 0;
        int duplicateNotes = numberOfNotes;
        int[] totalNotes = {100, 50, 10, 5, 2, 1};

        for (int totalNote : totalNotes) {
            numberOfNotes = duplicateNotes / totalNote;
            duplicateNotes = duplicateNotes % totalNote;
            sum += numberOfNotes;
        }

        return sum;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
