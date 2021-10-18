package codechef.java;

import java.util.Scanner;

public class LifeTheUniverseAndEverything {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        LifeTheUniverseAndEverything lifeTheUniverseAndEverything = new LifeTheUniverseAndEverything();
        lifeTheUniverseAndEverything.checkNumber();
    }

    void checkNumber()
    {
        while (true) {
            int number = getInteger();

            if (isNumber42(number))
                break;

            System.out.println(number);
        }
    }

    boolean isNumber42(int number)
    {
        return number == 42;
    }

    int getInteger()
    {
        return scanner.nextInt();
    }
}
