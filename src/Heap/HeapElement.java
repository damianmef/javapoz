package Heap;

public class HeapElement {
    private int value;
    private HeapElement prev = null;

    public HeapElement(int value, HeapElement prev)
    {
        this.value = value;
        this.prev = prev;
    }

    public int getValue() {
        return this.value;
    }

    public HeapElement getPrev() {
        return this.prev;
    }
}
