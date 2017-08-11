package Graphs;

public class Transforms {

    public static StructS[] transformAtoS(boolean[][] a, int n) {
        StructS[] result = new StructS[n];

        for(int i = 0; i < n; i++) {
            StructS tempItem = new StructS();
            result[i] = tempItem;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i][j]) {
                    result[i].collection.add(j);
                    result[i].counter++;
                    result[j].collection.add(i);
                    result[j].counter++;
                }
            }
        }

        return result;
    }

    public static Edge[] transformAtoE(boolean[][] a, int n) {
        /* wygenerowanie tablicy z wszystkimi możliwymi krawędziami */
        Edge[] result = Structures.generateEdgeArray(n);
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

    public static Edge[] moveItem(Edge[] result, int i, int j, int index)
    {
        for (int k = 0; k < result.length; k++) {
            /* jeśli znajdziemy w E krawędź {i:j} */
            if (result[k].a == i && result[k].b == j) {
                /* to zamieniamy ją z ostatnim nieprzesuniętym elementem */
                Edge temp = result[k];
                result[k] = result[index];
                result[index] = temp;
                break;
            }
        }
        return result;
    }

    public static boolean[][] transformEtoA(int n, Edge[] struct, int k)
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
