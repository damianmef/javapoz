package Graphs;

import java.util.Arrays;

public class Graphs {

    public static void main(String[] args) {

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



//


        /* Generator GNP
        *  n - liczba naturalna
        *  p - liczba pomiędzy 0 a 1
        */
//        generateGnp(4,0.5);

        /* Generator Gnk
        *  n - liczba naturalna
        *  k - liczba krawędzi
        */
//        generateGnk(4, 3);


        /* Transform A to E
        *  n - liczba naturalna
        *  p - liczba pomiędzy 0 a 1
        *  */
        transformAtoE(4, 0.5);
    }

    public static void transformAtoE(int n, double p) {
        boolean[][] a = GraphGnp.generateGNP(n, p);
        PrintStructures.printA(a);
        Edge[] e = Transforms.transformAtoE(a, n);
        PrintStructures.printE(e);
    }

    public static void generateGnp(int n, double p) {
        boolean[][] result = GraphGnp.generateGNP(n, p);
        PrintStructures.printA(result);
    }

    public static void generateGnk(int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n,k);
        PrintStructures.printE(result);
    }
}
