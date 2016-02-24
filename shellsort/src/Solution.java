/**
 * Created by liutao on 2/24/16.
 */
public class Solution {
    public static void shellSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int temp, j;
        int length = array.length;
        int gap = 1;
        while (gap < length / 3) {
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3) {
            for (int i = gap; i < length; i++) {
                temp = array[i];
                for (j = i - gap; j >= 0 && temp < array[j]; j -= gap) {
                    array[j + gap] = array[j];
                }
                array[j + gap] = temp;
            }
        }
    }
}
