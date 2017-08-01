package RandomWithoutRepeats;


import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Podaj ilość liczb");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /* Inicjalizacja tablicy liczb */
        int[] tablicaN = new int[n];

        /* Wypełnienie tablicy liczbami podanymi przez użytkownika */
        for (int i =0; i < tablicaN.length; i++){
            System.out.println("Podaj kolejną cyfrę: ");
            tablicaN[i] = scanner.nextInt();
        }

        System.out.println("Podaj ile liczb wylosować: ");
        int k = scanner.nextInt();

        Random random = new Random();

        int lastIndex = n-1;

        /* Wykonujemy k razy losowanie liczby */
        for (int i = 0; i<k; i++){
            int r = random.nextInt(n);

            /* Zamieniamy miejscami liczby: jedna o indeksie r a druga ostatnia z puli losowanych */
            int temp = tablicaN[r];
            tablicaN[r] = tablicaN[lastIndex];
            tablicaN[lastIndex] = temp;

            /* Zmiejszamy zakres losowanych liczb */
            lastIndex--;
        }

        /* Wypisane k liczb z tablicy, one są na jej końcu */
        for (int i = n; i > n-k ; i--){
            /* i-1 ponieważ n to ilość tablicy a indeksy są od 0 */
            System.out.println(tablicaN[i-1]);
        }



    }



}
