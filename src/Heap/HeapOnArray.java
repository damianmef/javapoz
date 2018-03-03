package Heap;

public class HeapOnArray {
    private int[] heap;
    private int counter = 0;

    public HeapOnArray(int size) {
        this.heap = new int[size];
    }

    public void push(int el)
    {
        this.heap[this.el2] = el;
        this.counter++;

    }

    public int pop()
    {





            this.counter--;
            return this.heap[this.counter];

    }
}
