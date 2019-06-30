import java.util.ArrayList;
import java.util.List;

/**
 * Created by liutao on 6/30/19.
 */
public class Solution {
    public void bucketSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int bucketSize = 5;
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        int bucketCount = (max - min) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < nums.length; i++) {
            int index = (nums[i] - min) / bucketCount;
            buckets.get(index).add(nums[i]);
        }
        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            insertionSort(buckets.get(i));
            for (int j = 0, len = buckets.get(i).size(); j < len; j++) {
                nums[index++] = buckets.get(i).get(j);
            }
        }
    }

    private void insertionSort(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i = 1, len = list.size(); i < len; i++) {
            int index = i;
            int selection = list.get(index);
            while (index > 0 && selection < list.get(index - 1)) {
                list.set(index, list.get(index - 1));
                --index;
            }
            list.set(index, selection);
        }
    }
}
