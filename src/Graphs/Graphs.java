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
        int n = 4;
        Edge[] test;

        test = generateEdgeArray(n);
        for (Edge e: test) {
            System.out.println(e.toString());
        }

    }

    private static Edge[] generateEdgeArray(int n) {
        int h = n*(n-1)/2;
        Edge[] result = new Edge[h];
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Edge newEdge = new Edge();
                newEdge.a = i;
                newEdge.b = j;
                result[index] = newEdge;
                index++;
            }
        }

        return result;
    }

    private static boolean[][] generateGNP(int n, double p ) {
        boolean[][] result = new boolean[n][n];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if(Math.random() < p) {
                    result[i][j] = true;
                    result[j][i] = true;
                }
            }
            // Wypełnienie przekątnej TRUE
            result[i][i] = true;
        }
        // Ostatni element
        result[n-1][n-1] = true;


        return result;
    }
}
