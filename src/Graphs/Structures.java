package Graphs;

public class Structures {

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


}
