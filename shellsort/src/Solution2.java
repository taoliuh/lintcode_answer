/**
 * Created by liutao on 2/29/16.
 */
public class Solution2 {
    public static void shellSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int gap = 1;
        int length = array.length;
        while (gap < length / 3) {
            gap = gap * 3 + 1;
        }
        for (; gap > 0; gap /= 3) {
            for (int i = gap; i < length; i++) {
                int index = i;
                int selection = array[index];
                while (index >= gap && selection < array[index - gap]) {
                    array[index] = array[index - gap];
                    index -= gap;
                }
                array[index] = selection;
            }
        }
    }
}
