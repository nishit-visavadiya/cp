package codechef;

import java.util.*;

public class CielAndReceipt {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        CielAndReceipt cielAndReceipt = new CielAndReceipt();
        cielAndReceipt.executeTestCases();
    }

    void executeTestCases() {

        int testCases = getIntegerValue();
        while (testCases-- > 0) {

            int totlePriceOfReceipt = getIntegerValue();
            System.out.println(calculateMinimumNumberOfMenus(totlePriceOfReceipt));
        }
    }

    int calculateMinimumNumberOfMenus(int totlePriceOfReceipt) {

        int minimumNumbersOfMenus = 0;

        int[] priceInMenus = setValuesInArray();

        while (totlePriceOfReceipt > 0) {

            for (int i = 11; i >= 0; i--) {

                if (totlePriceOfReceipt >= priceInMenus[i]) {
                    totlePriceOfReceipt -= priceInMenus[i];
                    minimumNumbersOfMenus++;
                    i++;

                }
            }
        }
        return minimumNumbersOfMenus;
    }

    int[] setValuesInArray() {

        int[] priceInMenus = new int[12];
        for (int i = 0; i < 12; i++) {
            priceInMenus[i] = (int) Math.pow(2, i);
        }
        return priceInMenus;
    }

    int getIntegerValue() {
        return sc.nextInt();
    }

}
