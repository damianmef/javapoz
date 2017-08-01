package WartoscBezwzgledna;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-01.
 */
public class WartoscBezwzgledna {

    public static void main(String[] args) {
        int liczba;
        System.out.println("Podaj liczbę");
        Scanner odczyt = new Scanner(System.in);
        liczba = odczyt.nextInt();

        if(liczba>=0)
        {
            System.out.println("Wartość bezwzgledna z liczby dodatniej " + liczba );

        }
        else
        {
            System.out.println("Wartość bezwzgledna z liczby ujemnej " + (-1)*liczba );
        }
    }
}
