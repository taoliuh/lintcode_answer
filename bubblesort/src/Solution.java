/**
 * Created by liutao on 2/23/16.
 */
public class Solution {
    public int[] bubbleSort(int[] data) {
        if (data == null || data.length == 0) {
            return data;
        }
        int length = data.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }
}
