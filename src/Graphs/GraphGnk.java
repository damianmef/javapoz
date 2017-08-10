package Graphs;

public class GraphGnk {
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
}
