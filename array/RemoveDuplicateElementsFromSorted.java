package array;

import java.util.Scanner;

public class RemoveDuplicateElementsFromSorted {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        RemoveDuplicateElementsFromSorted removeDuplicateElementsFromSorted = new RemoveDuplicateElementsFromSorted();
        removeDuplicateElementsFromSorted.removeDuplicates();
    }

    void removeDuplicates()
    {
        int j = 0;
        int sizeOfArray = getIntegerValue();

        int[] array = new int[sizeOfArray];
        int[] commonElements = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++)
        {
            array[i] = getIntegerValue();
        }

        for (int i = 0; i < sizeOfArray-1; i++)
        {
            if (array[i] != array[i+1])
            {
                commonElements[j] = array[i];
                j++;
            }
        }

        commonElements[j] = array[array.length-1];

        for (int commonElement: commonElements)
        {
            System.out.print(commonElement + " ");
        }
    }

    int getIntegerValue()
    {
        return scanner.nextInt();
    }
}
