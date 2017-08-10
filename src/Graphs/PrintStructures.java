package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintStructures {

    public static void printA(boolean[][] a) {
        for(int i =0; i < a.length; i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static void printE(Edge[] e) {
        for (Edge item: e) {
            System.out.println(item.toString());
        }
    }

    public static void printEV2(ArrayList<EdgeV2> e) {
        for (EdgeV2 item: e) {
            System.out.println(item.toString());
        }
    }
}
