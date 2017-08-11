package Graphs;

import java.util.ArrayList;

public class StructS implements Cloneable {
    public ArrayList<Integer> collection;
    public int counter;

    public StructS() {
        this.collection = new ArrayList<Integer>();
        this.counter = 0;
    }

    @Override
    public String toString()
    {
        return this.collection.toString() + "(" +Integer.toString(this.counter) + ")";
    }
}
