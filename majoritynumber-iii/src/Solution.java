import java.util.ArrayList;

/**
 * Majority Number III Show result
 * Given an array of integers and a number k, the majority number is the number that occurs more than 1/k of the size of the array.
 *
 * Find it.
 */
public class Solution {
    /**
     * @param nums: A list of integers
     * @param k: As described
     * @return: The majority number
     */
    public int majorityNumber(ArrayList<Integer> nums, int k) {
        // write your code
        if (nums == null || k == 0) {
            return -1;
        }
        quickSort(nums, 0, nums.size() - 1);
        System.out.println(nums);
        int n = nums.size() / k;
        int index = 0;
        while (index < nums.size()) {
            int count = 0;
            int target = nums.get(index);
            while (index < nums.size() && target == nums.get(index)) {
                ++index;
                ++count;
                if (count > n) {
                    return target;
                }
            }
        }
        return -1;
    }

    private void quickSort(ArrayList<Integer> nums, int start, int end) {
        if (nums == null || start >= end) {
            return;
        }
        int low = start, high = end - 1, pivot = nums.get(end);
        while (low < high) {
            while (low < high && nums.get(low) < pivot) {
                ++low;
            }
            while (low < high && nums.get(high) >= pivot) {
                --high;
            }
            swap(nums, low, high);
        }
        if (nums.get(low) >= nums.get(end)) {
            swap(nums, low, end);
        } else {
            ++low;
        }
        quickSort(nums, start, low - 1);
        quickSort(nums, low + 1, end);
    }

    private void swap(ArrayList<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }
}