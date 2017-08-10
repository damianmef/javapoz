package Graphs;

public class EdgeV2 {
    public int a;
    public int b;
    public boolean c;

    public EdgeV2() {
        this.a = 0;
        this.b = 0;
        this.c = false;
    }
    @Override
    public String toString()
    {
        return Integer.toString(this.a) + Integer.toString(this.b) + Boolean.toString(this.c);
    }
}
