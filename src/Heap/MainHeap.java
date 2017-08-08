package Heap;

public class MainHeap {
    public static void main(String[] args) {
        ListMergeSort list = new ListMergeSort();

        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(30);
        list.add(5);
        list.add(6);


        list.print();

        System.out.println("------");

        list.sort();
        list.print();;

    }
}
