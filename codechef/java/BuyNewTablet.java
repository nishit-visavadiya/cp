package codechef.java;

import java.util.Scanner;

public class BuyNewTablet {

    Scanner sc = new Scanner(System.in);

    int area = 0;
    int budgetOfChef;
    int priceOfTablet;
    int numberOfTabletWhichChefHasInToDo;

    public static void main(String[] args) {
        BuyNewTablet buyNewTablet = new BuyNewTablet();
        buyNewTablet.executeTestCases();
    }

    void executeTestCases()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            numberOfTabletWhichChefHasInToDo = getInteger();
            budgetOfChef = getInteger();

            int lengthOfTablet = 0;
            int breadthOfTablet = 0;

            while (numberOfTabletWhichChefHasInToDo --> 0)
            {
                lengthOfTablet = getInteger();
                breadthOfTablet = getInteger();
                priceOfTablet = getInteger();

                //System.out.println(canChefBuyTablet(lengthOfTablet, breadthOfTablet));

                calculateAreaToByTablet(lengthOfTablet, breadthOfTablet);

            }

            if (area!=0)
                System.out.println(area);
            else
                System.out.println("no tablet");
            area = 0;
        }
    }

    void calculateAreaToByTablet(int lengthOfTablet, int breadthOfTablet)
    {
        if (budgetOfChef >= priceOfTablet)
        {
            area = Math.max(area, lengthOfTablet * breadthOfTablet);
        }
    }

    int getInteger()
    {
        return sc.nextInt();
    }
}
