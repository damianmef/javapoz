package Graphs;

import java.util.ArrayList;

public class GraphGnk {
    public static Edge[] generateGnk(int n, int k) {
        Edge[] result = Structures.generateEdgeArray(n);
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

    public  static ArrayList<EdgeV2> generateGNKv2(int n, int k) {
        Edge[] tmpResult = generateGnk(n, k);

        ArrayList<EdgeV2> result = new ArrayList<>();


        for (int i = 0; i < tmpResult.length; i++) {
            EdgeV2 newObject = new EdgeV2();
            newObject.a = tmpResult[i].a;
            newObject.b = tmpResult[i].b;
            result.add(newObject);
        }

        int h = n*(n-1)/2;
        for (int i = h-1; i >= h-k; i--) {
            result.get(i).c = true;
        }

        return result;
    }


}
