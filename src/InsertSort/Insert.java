package InsertSort;

import java.io.Console;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-01.
 */
public class Insert {

    private static int tablica[];
    private static int ile_liczb;

    /**
     * 2,4,3,6,
     *
     */
    private static void insertionsort(int tablica[], int ile_liczb) {
        int i,j,v;

        for (i=1;i<ile_liczb;i++) {
            j=i;
            v=tablica[i];
            while ((j>0) && (tablica[j-1]>v)) {
                tablica[j]=tablica[j-1];
                j--;
            }
            tablica[j]=v;
        }
    }


    public static void main(String[] args) {

        int i,liczba;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczb chesz posortowac.");
        ile_liczb = scanner.nextInt();
        tablica = new int[ile_liczb];
        for(i=0; i<ile_liczb; i++) {
            tablica[i] = scanner.nextInt();
        }

        System.out.println("Tablica przed posortowaniem:");
        for(i=0; i<ile_liczb; i++)
            System.out.println(tablica[i]);
        insertionsort(tablica,ile_liczb);
        System.out.println("Tablica po posortowaniu:");
        for(i=0; i<ile_liczb; i++)
            System.out.println(tablica[i]);
    }

//    public static void main(String[] args) {
//        System.out.println("Podaj wielkość tablicy");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        if (n > 0) {
//            int[] tablicaN = new int[n];
//
//        /* Wypełnienie tablicy liczbami podanymi przez użytkownika */
//            for (int i = 0; i < tablicaN.length; i++) {
//                System.out.println("Podaj kolejną cyfrę: ");
//                tablicaN[i] = scanner.nextInt();
//            }
//            tablicaN = insertSort(tablicaN);
//            for (int i = 0; i < tablicaN.length; i++) {
//                System.out.println(tablicaN[i]);
//            }
//        } else {
//            System.out.println("Podana wielkość jest nieprawidłowa");
//        }
//
//    }
//
//    public static int[] insertSort(int[] tab) {
//
//        int[] results = new int[tab.length];
//
//        results[0] = tab[0];
//        int k=1;
//
//        for (int i = 1; i < tab.length; i++) {
//            boolean added=false;
//            for (int j = i ; j > 0; j--) {
//                if (tab[j] <  tab[j-1]) {
//                    results = move(results, j-1);
//                    results[j-2] = tab[i];
//                    k++;
//                    added=true;
//                    break;
//                }
//            } if(!added){
//                results[k]=tab[i];
//                k++;
//            }
//        }
//
//      return results;
//    }
//
//    public  static int[] move (int[] tab, int index) {
//        for (int i = tab.length - 1; i >= index; i--) {
//            tab[i] = tab[i-1];
//        }
//
//        return tab;
//    }
}
