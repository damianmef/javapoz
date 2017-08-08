package Heap;

import java.util.Random;

public class MainHeap {
    public static void main(String[] args) {
        ListMergeSort list = new ListMergeSort();
        List listOld = new List();

        Random rand = new Random();
        int random = 0;

        for (int i = 0; i < 10000000; i++) {
            random = rand.nextInt(10000000);
            list.add(random);
            listOld.add(random);
        }

        System.out.println("------START!----");

        list.sort();
        System.out.println("------SORT MERGE----");

        listOld.sort();
        System.out.println("------SORT BUBLE----");
    }
}
