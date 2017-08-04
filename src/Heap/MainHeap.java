package Heap;

public class MainHeap {
    public static void main(String[] args) {
        List list = new List();

        list.addSorted(3);
        list.addSorted(2);
        list.addSorted(1);
        list.addSorted(4);
        list.addSorted(5);
        list.addSorted(1);

        list.print();
//        list.printReverse();
    }
}
