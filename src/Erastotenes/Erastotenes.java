package Erastotenes;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-02.
 */
public class Erastotenes {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj górny zakres: ");
        int zakresGorny = in.nextInt();
        int pierwiastek = (int) Math.floor(Math.sqrt(zakresGorny));

        int[] tab = new int[zakresGorny - 1];
        for (int i = 1; i < zakresGorny; i++) {
            tab[i - 1] = i + 1;
        }

        getPrimeNumbersFromArray(tab, pierwiastek);

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                System.out.println(tab[i]);
            }
        }

    }

    public static int[] getPrimeNumbersFromArray(int tab[], int pierwiastek) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] != 0 && tab[i] != 0 && tab[j] % tab[i] == 0) {
                    tab[j] = 0;
                }
            }
            if (tab[i] > pierwiastek) {
                break;
            }
        }
        return tab;
    }

}
