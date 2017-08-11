package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class Graphs {

    public static void main(String[] args) {

        /* Generator GNP
        *  n - liczba naturalna
        *  p - liczba pomiędzy 0 a 1
        */
//        generateGnp(4,0.5);

        /* Generator Gnk
        *  n - liczba naturalna
        *  k - liczba krawędzi
        */
//        generateGnk(4, 3);


        /* Transform A to E
        *  n - liczba naturalna
        *  p - liczba pomiędzy 0 a 1
        *  */
//        transformAtoE(4, 0.5);

        /*
        * Transform E to A
        *  n - liczba naturalna
        *  k - liczba krawędzi
        * */
//        transformaEtoA(4, 3);

//        generateGnkV2(4,3);

//        transformAtoS(4);

//        triangleFinder(4);

        graphDegree(12);

    }
    public static void transformAtoS(int n) {
        boolean[][] a = GraphGnp.generateGNP(n, 0.5);
        PrintStructures.printA(a);
        StructS[] result = Transforms.transformAtoS(a, n);
//        System.out.println(result.toString());
        PrintStructures.printStructS(result);
    }

    public static void transformaEtoA(int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n, k);
        PrintStructures.printE(result);
        boolean[][] a = Transforms.transformEtoA(n, result, k);
        PrintStructures.printA(a);
    }

    public static void transformAtoE(int n, double p) {
        boolean[][] a = GraphGnp.generateGNP(n, p);
        PrintStructures.printA(a);
        Edge[] e = Transforms.transformAtoE(a, n);
        PrintStructures.printE(e);
    }

    public static void generateGnp(int n, double p) {
        boolean[][] result = GraphGnp.generateGNP(n, p);
        PrintStructures.printA(result);
    }

    public static void generateGnk(int n, int k) {
        Edge[] result = GraphGnk.generateGnk(n,k);
        PrintStructures.printE(result);
    }

    public static void generateGnkV2(int n, int k) {
        ArrayList<EdgeV2> result = GraphGnk.generateGNKv2(n,k);
        PrintStructures.printEV2(result);
    }

    public static void triangleFinder(int n) {
        boolean[][] a = GraphGnp.generateGNP(n, 0.8);
        PrintStructures.printA(a);
        int triangles = Triangles.countTriangles(a, n);
        PrintStructures.printString("Liczba trójkątów: " + triangles);
    }

    public static void graphDegree(int n) {
        boolean[][] a = GraphGnp.generateGNP(n, 0.8);
        StructS[] s = Transforms.transformAtoS(a, n);
        PrintStructures.printStructS(s);
        int result = Degrees.getGraphDegree(s);
        PrintStructures.printString(Integer.toString(result));
    }
}
