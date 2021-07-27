package random;

import java.util.Scanner;

public class Pelindrom {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        if (str.equals(str2))
            System.out.println("pelindrom");
        else
            System.out.println("not pelindrom");
    }

}
