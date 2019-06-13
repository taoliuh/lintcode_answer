import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liutao on 26/03/2019.
 */
public class Solution2 {

    public int majorityNumber(List<Integer> nums, int k) {
        // write your code here
        if (nums == null || k == 0) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.size();
        for (int i = 0; i < length; i++) {
            int key = nums.get(i);
            if (map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, ++count);
            } else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (1f / k < count * 1f / length) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
