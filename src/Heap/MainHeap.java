package Heap;

public class MainHeap {
    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.push(1);
        heap.push(2);
        heap.push(3);
        heap.push(4);
        heap.push(5);

        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
    }
}
