/**
 * Created by liutao on 2/29/16.
 */
public class Heap {

    public static final int MIN_HEAP = 0;
    public static final int MAX_HEAP = 1;

    private int[] mHeap;

    private int mHeapSize = 0;

    private int mHeapType = MAX_HEAP;

    public Heap(int size) {
        this.mHeap = new int[size];
        this.mHeapSize = 0;
    }

    public Heap(int[] array) {
        this(array, MAX_HEAP);
    }

    public Heap(int[] array, int heapType) {
        this.mHeap = array;
        this.mHeapSize = array.length;
        this.mHeapType = heapType;
    }

    public void maxHeapify(int i) {
        if (mHeap == null || mHeapSize == 0) {
            return;
        }
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < mHeapSize && mHeap[largest] < mHeap[left]) {
            largest = left;
        }
        if (right < mHeapSize && mHeap[largest] < mHeap[right]) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    public void minHeapify(int i) {
        if (mHeap == null || mHeapSize == 0) {
            return;
        }
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        if (left < mHeapSize && mHeap[left] < mHeap[smallest]) {
            smallest = left;
        }
        if (right < mHeapSize && mHeap[right] < mHeap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    private void swap(int i, int j) {
        if (mHeap == null || mHeapSize == 0) {
            return;
        }
        int max = Math.max(i, j);
        if (max >= mHeapSize) {
            return;
        }
        int temp = mHeap[i];
        mHeap[i] = mHeap[j];
        mHeap[j] = temp;
    }

    public void buildHeap() {
        for (int i = mHeapSize / 2; i >= 0; --i) {
            if (mHeapType == MIN_HEAP) {
                minHeapify(i);
            } else {
                maxHeapify(i);
            }
        }
    }

    public void heapSort() {
        if (mHeap == null || mHeapSize == 0) {
            return;
        }
        buildHeap();
        for (int i = mHeapSize - 1; i > 0; --i) {
            swap(0, i);
            --mHeapSize;
            if (mHeapType == MIN_HEAP) {
                minHeapify(0);
            } else {
                maxHeapify(0);
            }
        }
        mHeapSize = mHeap.length;
    }

    @Override
    public String toString() {
        if (mHeap == null || mHeapSize == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i : mHeap) {
            sb.append(i);
            sb.append(',').append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        return sb.append(']').toString();
    }
}
