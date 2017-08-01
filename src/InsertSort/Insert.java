package InsertSort;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-01.
 */
public class Insert {
    public static void main(String[] args) {
        System.out.println("Podaj wielkość tablicy");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] tablicaN = new int[n];

        /* Wypełnienie tablicy liczbami podanymi przez użytkownika */
        for (int i =0; i < tablicaN.length; i++) {
            System.out.println("Podaj kolejną cyfrę: ");
            tablicaN[i] = scanner.nextInt();
        }
        tablicaN = insertSort(tablicaN);
        for(int i = 0; i < tablicaN.length; i++) {
            System.out.println(tablicaN[i]);
        }

    }

    public static int[] insertSort(int[] tab) {

        int[] results = new int[tab.length];

        results[0] = tab[0];


        for (int i = 0; i < tab.length; i++) {
            for (int j = tab.length - 1; j > 0; j--) {
                if (tab[i] > results[j - 1] && tab[i] <= results[j]) {
                    results = move(results, j);
                    results[j] = tab[i];
                    break;
                }
            }
        }

      return tab;
    }

    public  static int[] move (int[] tab, int index) {
        for (int i = tab.length - 2; i > index; i--) {
            tab[i+1] = tab[i];
        }

        return tab;
    }
}
