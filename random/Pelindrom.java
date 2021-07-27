package random;

import java.util.Scanner;

public class Pelindrom {

    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Pelindrom pelindrom = new Pelindrom();
        System.out.println(pelindrom.pelindrom());
    }

    String pelindrom() {
        String str1 = getString();
        String str2 = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }

        if (str1.equals(str2))
            return "pelindrom";
        else
            return "not pelindrom";
    }

    String getString() {
        return s.nextLine();
    }

}
