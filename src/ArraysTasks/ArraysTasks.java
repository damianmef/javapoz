package ArraysTasks;
import java.util.Scanner;
/**
 * Created by RENT on 2017-08-02.
 */
public class ArraysTasks {
    public static int Sum(int[] tab) {

        int wynik=0;
        for (int i = 0; i < tab.length; i++) {
            wynik += tab[i];
        }
        System.out.println("Suma elementow tablicy: " + wynik);

        return wynik;
    }

    public static int MaxValue(int[] tab) {
        int maxValue = tab[0];
        for(int i = 1; i < tab.length; i++){
            if (maxValue < tab[i]){
                maxValue = tab[i];
            }
        }
        System.out.println("Największa wartość to " + maxValue);
        return maxValue;
    }

    public static void main(String[] args) {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkośc tablicy: ");
        n = scanner.nextInt();
        int[] tab = new int[n];
        System.out.println("Podaj kolejno elementy tablicy: ");
        for (int i = 0; i<n; i++){
            tab[i]=scanner.nextInt();
        }
        try{
            MaxValue(tab);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
