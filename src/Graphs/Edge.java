package Graphs;

public class Edge {
    public int a;
    public int b;

    public Edge() {
        this.a = 0;
        this.b = 0;
    }
    @Override
    public String toString()
    {
        return Integer.toString(this.a) + Integer.toString(this.b);
    }
}
