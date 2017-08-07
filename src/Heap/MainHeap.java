package Heap;

public class MainHeap {
    public static void main(String[] args) {
        List list = new List();

        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);

//        list.add(5);
//        list.add(1);

        list.sort();
        list.print();

//        list.printReverse();
    }
}
