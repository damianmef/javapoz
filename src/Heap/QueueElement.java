package Heap;

public class QueueElement {
    private int value;
    private QueueElement prev = null;
    private QueueElement next = null;

    public QueueElement(int value)
    {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public QueueElement getPrev() {
        return this.prev;
    }

    public QueueElement getNext() {
        return this.next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPrev(QueueElement prev) {
        this.prev = prev;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
}
