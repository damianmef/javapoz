package Heap;

public class MainHeap {
    public static void main(String[] args) {
        ListMergeSort list = new ListMergeSort();

        list.add(1);
        list.add(3);
        list.add(6);

        list.print();

        System.out.println("------");
        ListMergeSort list2 = new ListMergeSort();

        list2.add(2);
        list2.add(5);
        list2.add(6);

        list2.print();
        System.out.println("------");
        list.mergeLists(list2);
        list.print();
        System.out.println("------");
        list2.print();
    }
}
