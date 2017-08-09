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
        int n = 4;
        double p = 0.5;

        boolean[][] a = generateGNP(n, p);
        int k = countEdgesInA(a, n);
        Edge[] result = transformAtoE(a, n);
        for (int i = result.length - 1; i >= result.length - k; i--) {
            System.out.println(result[i].toString());
        }
    }

    private static int countEdgesInA(boolean[][] a, int n) {
        int result = 0;
        /* Przelatujemy po prawym górnym trójkącie w tablicy A */
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i][j]) {
                    result++;
                }
            }
        }
        return result;
    }

    private static Edge[] transformAtoE(boolean[][] a, int n) {
        /* wygenerowanie tablicy z wszystkimi możliwymi krawędziami */
        Edge[] result = generateEdgeArray(n);
        /* index z którym zamieniamy daną krawędź, po każdej zamianie
        zmniejszamy go 1 = zmniejsząc zakres nieprzesuniętych elementów
         */
        int index = result.length - 1;

        /* Przelatujemy po strukturze A, czyli po "prawym trójkącie" */
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i][j]) {
                    /* zamiana istniejącej krawędzi z ostatnią z nieprzesuniętych */
                    result = moveItem(result, i, j, index);
                    /* zmniejszamy zakres nieprzesuniętych elementów w results */
                    index--;
                }
            }
        }
        return result;
    }

    private static Edge[] moveItem(Edge[] result, int i, int j, int index)
    {
        for (Edge e: result) {
            /* jeśli znajdziemy w E krawędź {i:j} */
            if (e.a == i && e.b == j) {
                /* to zamieniamy ją z ostatnim nieprzesuniętym elementem */
                Edge temp = e;
                e = result[index];
                result[index] = temp;
            }
        }
        return result;
    }

    private static boolean[][] transformEtoA(int n, Edge[] struct, int k)
    {
        boolean[][] result = new boolean[n][n];
        int h = struct.length;

        for(int i = h-1; i > h-1 -k;i--) {
            result[struct[i].a][struct[i].b] = true;
            result[struct[i].b][struct[i].a] = true;
        }

        return result;
    }

    private static Edge[] generateGnk(int n, int k) {
        Edge[] result = generateEdgeArray(n);
        int h = n*(n-1)/2;

        if ( k <= h ) {
            while (k > 0) {
                int r = (int) Math.floor(Math.random() * h);

                Edge temp = result[r];
                result[r] = result[h - 1];
                result[h - 1] = temp;
                h--;
                k--;
            }
        }

        return result;
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
