package reverswelcome;

import java.util.Scanner;

public class ArrayUtils {

    String[] createArray(int size) {
        String[] arrayNames = new String[size];
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj " + size + " imion: \n");
        for (int i = 0; i < arrayNames.length; i++) {
            int nameNr = i + 1;
            System.out.println("Imie nr: " + nameNr);
            arrayNames[i] = scanner.nextLine();
        }
        return arrayNames;
    }

    void printReversArray(String[] array) {
        System.out.print("\n");
        int n = array.length - 1;
        while (n >= 0) {
            String name = array[n];
            System.out.println("czesc " + name);
            n--;
        }
    }
}
