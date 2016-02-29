/**
 * Created by liutao on 2/29/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        Heap heap = new Heap(array, Heap.MIN_HEAP);
        heap.heapSort();
        System.out.print(heap);
    }
}
