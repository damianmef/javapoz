package Heap;

public class Heap {
    private HeapElement top = null;

    public void push(int el)
    {
        HeapElement tmp = new HeapElement(el, this.top);
        this.top = tmp;
    }

    public int pop()
    {
        if (this.top != null) {
            int tmp = top.getValue();
            top = top.getPrev();
            return tmp;
        }

        return -1;

    }
}
