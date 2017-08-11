package Graphs;

public class Degrees {

    public static int getGraphDegree(StructS[] s) {
        int result = 0;

        for (StructS item: s) {
            if (item.counter > result) {
                result = item.counter;
            }
        }

        return result;
    }
}
