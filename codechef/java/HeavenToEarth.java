package codechef.java;

import java.util.Scanner;

public class HeavenToEarth {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HeavenToEarth heavenToEarth = new HeavenToEarth();
        heavenToEarth.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            double numberOfFloors = getDouble();
            double velocityOfStairs = getDouble();
            double velocityOfElevator = getDouble();

            ChefShouldUseStairsOrTheElevator(numberOfFloors, velocityOfStairs, velocityOfElevator);
        }
    }

    void ChefShouldUseStairsOrTheElevator(double numberOfFloors, double velocityOfStairs, double velocityOfElevator)
    {
        double distanceFromStairs = numberOfFloors * Math.sqrt(2);
        double distanceFromElevator = numberOfFloors * 2;

        double timeFromStairs = distanceFromStairs / velocityOfStairs;
        double timeFromElevator = distanceFromElevator / velocityOfElevator;

        if (timeFromStairs < timeFromElevator)
        {
            System.out.println("Stairs");
        }
        else
        {
            System.out.println("Elevator");
        }
    }

    int getInteger() {
        return scanner.nextInt();
    }

    double getDouble()
    {
        return scanner.nextDouble();
    }
}
