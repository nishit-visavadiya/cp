package codechef.java;

import java.util.Scanner;

public class MovieWeekend {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        MovieWeekend movieWeekend = new MovieWeekend();
        movieWeekend.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int numberOfMovies = getInteger();

            int[] a = getArray(numberOfMovies);
            int[] b = getArray(numberOfMovies);

            System.out.println(findTheMovieToWatch(a, b, numberOfMovies));
        }
    }

    int findTheMovieToWatch(int[] length, int[] rating, int numberOfMovies)
    {
        int maximumOfLengthAndRating = 0;
        int maximumRating = 0;
        int minimumIndex = 0;

        for (int i = 0; i < numberOfMovies; i++)
        {
            if (length[i] * rating[i] >= maximumOfLengthAndRating && rating[i] > maximumRating)
            {
                maximumOfLengthAndRating = length[i] * rating[i];
                maximumRating = rating[i];
                minimumIndex = i;
            }
        }
        return minimumIndex + 1;
    }

    int[] getArray(int sizeOfArray)
    {
        int[] arr = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++)
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
