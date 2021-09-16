package codechef.java;

import java.util.Scanner;

public class CuttingRecipes {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        CuttingRecipes cuttingRecipes = new CuttingRecipes();
        cuttingRecipes.execute();
    }

    void execute()
    {
        int testCases = getInteger();

        while (testCases --> 0)
        {
            int totalIngredients = getInteger();

            int[] ingredients = getArray(totalIngredients);
            //System.out.println(findLesserIngredients(ingredients, totalIngredients));

            int g = gcd(ingredients[0], ingredients[1]);

            for (int i = 2; i < totalIngredients; i++)
            {
                g = gcd(g, ingredients[i]);
            }

            for (int i : ingredients)
            {
                System.out.print((i / g) + " ");
            }
            System.out.println();
        }
    }

    /*int findLesserIngredients(int[] ingredients, int totalIngredients)
    {
        int g = gcd(ingredients[0], ingredients[1]);

        for (int i = 2; i < totalIngredients; i++)
        {
            g = gcd(g, ingredients[i]);
        }

        for (int i : ingredients)
        {
            System.out.println((i / g) + " ");
        }
    }*/

    int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    int[] getArray(int size) {
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
