/**
 * Created by liutao on 2/24/16.
 */
public class Solution {
    public static void insertionSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int index = i;
            int selection = array[index];
            while (index > 0 && selection < array[index - 1]) {
                array[index] = array[index - 1];
                --index;
            }
            array[index] = selection;
        }
    }
}
