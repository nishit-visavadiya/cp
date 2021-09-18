package codechef.java;

import java.util.Scanner;

public class Coldplay {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        Coldplay coldplay = new Coldplay();
        coldplay.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int minutesToReachPark = getInteger();
            int minutesOfSong = getInteger();

            System.out.println(findHowManyTimesChefCanPlaySong(minutesToReachPark, minutesOfSong));
        }
    }

    int findHowManyTimesChefCanPlaySong(int minutesToReachPark, int minutesOfSong)
    {
        return minutesToReachPark / minutesOfSong;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
