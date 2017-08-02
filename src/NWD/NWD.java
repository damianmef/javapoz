package NWD;
import java.util.Scanner;
/**
 * Created by RENT on 2017-08-02.
 */
public class NWD {
    public static int euclides(int a, int b){
        while (a != b){
            if (a > b){
                a -= b;
            } else{
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wartość a: ");
        int a = in.nextInt();
        System.out.print("Podaj wartość b: ");
        int b = in.nextInt();
        System.out.println("NWD dla wartości " + a + " " + b + " wynosi " + euclides(a, b));
    }
}
