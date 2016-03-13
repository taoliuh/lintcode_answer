import java.util.Arrays;

public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers ,int target) {
        // write your code here
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        Arrays.sort(numbers);
        int len = numbers.length;
        int[] sums = new int[len - 2];
        for (int i = 0; i < len - 2; i++) {
            int newTarget = target - numbers[i];
            int left = i + 1, right = len - 1;
            int closestSum = 0;
            int diff = Integer.MAX_VALUE;
            while (left < right) {
                int twoSum = numbers[left] + numbers[right];
                if (twoSum < newTarget) {
                    if (diff > Math.abs(twoSum - newTarget)) {
                        diff = Math.abs(twoSum - newTarget);
                        closestSum = twoSum;
                    }
                    ++left;
                } else if (twoSum > newTarget) {
                    if (diff > Math.abs(twoSum - newTarget)) {
                        diff = Math.abs(twoSum - newTarget);
                        closestSum = twoSum;
                    }
                    --right;
                } else {
                    return target;
                }
            }
            sums[i] = numbers[i] + closestSum;
        }
        int closestThreeSum = 0, diff = Integer.MAX_VALUE;
        for (int i = 0; i < len - 2; i++) {
            if (Math.abs(sums[i] - target) < diff) {
                closestThreeSum = sums[i];
                diff = Math.abs(sums[i] - target);
            }
        }
        return closestThreeSum;
    }
}
