package Silnia;

import java.util.Scanner;
/**
 * Created by RENT on 2017-08-02.
 */
public class Silnia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int x = in.nextInt();

        System.out.println("Silnia: " + silnia(x));



    }
    public static int silnia(int x){
        int result = 0;
        if( x < 1){
            return 1;
        }
        else {
            result = x * silnia(x-1);
        }
        return result;
    }
}
