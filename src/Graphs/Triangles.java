package Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangles {

    public static int countTriangles(boolean[][] a, int n) {
        StructS[] tempStructureS = Transforms.transformAtoS(a, n);
        int triangles = 0;

        ArrayList<ArrayList<Integer>> trianglesCollection = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < tempStructureS.length; i++) {
            for (Integer item: tempStructureS[i].collection) {

                temp = (ArrayList<Integer>)tempStructureS[i].collection.clone();
                temp.retainAll(tempStructureS[item].collection);

                for (Integer e: temp) {
                    ArrayList<Integer> tempList = new ArrayList<>();
                    tempList.add(i);
                    tempList.add(item);
                    tempList.add(e);
                    trianglesCollection.add(tempList);
                }

            }
        }

// add elements to al, including duplicates
        Set<ArrayList<Integer>> hs = new HashSet<>();
        hs.addAll(trianglesCollection);
        trianglesCollection.clear();
        trianglesCollection.addAll(hs);

        return triangles;

    }
}
