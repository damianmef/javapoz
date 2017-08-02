package ID;

import java.util.Scanner;

/**
 * Created by RENT on 2017-08-02.
 */
public class ID {
    public static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

    public static void checkNumber(String n) {
        char[] litery = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] liczby = new int[] {10,	11,	12,	13,	14,	15,	16,	17,	18,	19,	20,	21,	22,	23,	24,	25,	26,	27,	28,	29,	30,	31,	32,	33,	34,	35};
        int suma = 0;

        if (n.length() == 9) {
            for (int i = 0; i < 3; i++) {
//                isNumeric(n.charAt(i));
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < litery.length; j++) {
                if (i < 3) {
                    if (n.charAt(i) == litery[j]) {
                        if (i == 0) {
                            suma += 7 * liczby[j];
                        }
                        if (i == 1) {
                            suma += 3 * liczby[j];
                        }
                        if (i == 2) {
                            suma += liczby[j];
                        }
                    }
                }
            }
        }
        for (int i = 4; i < 9; i++) {
            int a = n.charAt(i);
            a -= 48;
            switch (i) {
                case 4:
                case 7:
                    suma += 7 * a;
                    break;
                case 5:
                case 8:
                    suma += 3 * a;
                    break;
                case 6:
                    suma += a;
                    break;
            }
        }

        int wynik = suma % 10;
        System.out.println(suma);
        System.out.println(wynik);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj numer dowodu");
        String NrDokumentu = sc.nextLine();

        checkNumber(NrDokumentu);
    }
}
