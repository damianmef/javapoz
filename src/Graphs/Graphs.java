package Graphs;

import java.util.Arrays;

public class Graphs {

    public static void main(String[] args) {

        // n - liczba naturalna
        // p - liczba pomiędzy 0 a 1
        /* Generator GNP
         */
//        boolean[][] result = generateGNP(4, 0.5);
//        for(int i =0; i < result.length; i++){
//            System.out.println(Arrays.toString(result[i]));
//        }

        /*
            Testowe wywołanie generowania tablicy E typu Edge
         */
//        int n = 4;
//        Edge[] test;
//
//        test = generateEdgeArray(n);
//        for (Edge e: test) {
//            System.out.println(e.toString());
//        }

        /*
        Generator Gnk
         */
//        int n = 4;
//        int k = 6;
//        Edge[] resultGnk = generateGnk(n,k);
//
//        if( k <= resultGnk.length ) {
//            for (int i = resultGnk.length - 1; i >= resultGnk.length - k; i--) {
//                System.out.println(resultGnk[i].toString());
//            }
//        }


        /*
        * Transform E to A
        * */
//        int n = 4;
//        int k = 4;
//        Edge[] resultGnk = generateGnk(n,k);
//        boolean[][] result = transformEtoA(n, resultGnk, k);
//
//        for(int i =0; i < result.length; i++){
//            System.out.println(Arrays.toString(result[i]));
//        }
//        for (int i = resultGnk.length - 1; i >= resultGnk.length - k; i--) {
//            System.out.println(resultGnk[i].toString());
//        }


        /* Transform A to E */
//        int n = 4;
//        double p = 0.5;
//
//        boolean[][] a = generateGNP(n, p);
//        int k = countEdgesInA(a, n);
//        Edge[] result = transformAtoE(a, n);
//        for (int i = result.length - 1; i >= result.length - k; i--) {
//            System.out.println(result[i].toString());
//        }
    }




}
