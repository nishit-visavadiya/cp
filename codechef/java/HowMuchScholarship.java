package codechef.java;

import java.util.Scanner;

public class HowMuchScholarship {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        HowMuchScholarship howMuchScholarship = new HowMuchScholarship();
        howMuchScholarship.execute();
    }

    void execute()
    {
        int rank = getInteger();

        System.out.println(calculateTheScholarship(rank));
    }

    int calculateTheScholarship(int rank)
    {
        if (rank <= 50)
            return 100;
        else if (rank <= 100)
            return 50;
        else
            return 0;
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
