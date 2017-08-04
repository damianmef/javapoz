package Heap;

public class ListElement {
    private int value;
    private ListElement prev = null;
    private ListElement next = null;

    public ListElement(int value)
    {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public ListElement getPrev() {
        return this.prev;
    }

    public ListElement getNext() {
        return this.next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }
}
