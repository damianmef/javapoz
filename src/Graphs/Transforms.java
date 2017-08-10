package Graphs;

public class Transforms {


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




}
