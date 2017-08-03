package Heap;

public class QueueOnArray {
    private int[] queue;
    private int first = 0;
    private int last = 0;

    public QueueOnArray(int size)
    {
        this.queue = new int[size];
    }

    public void add(int el)
    {
        this.queue[this.last] = el;
        this.last++;
    }

    public int get()
    {
//        int pom = this.queue[this.first];
//        this.first++;
//        return pom;
        return this.queue[this.first++];
    }
}
