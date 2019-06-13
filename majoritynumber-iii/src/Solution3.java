import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by liutao on 26/03/2019.
 */
public class Solution3 {
    public int majorityNumber(List<Integer> nums, int k) {
        // write your code here
        if (nums == null || k <= 0) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.size();
        for (int i = 0; i < length; i++) {
            int key = nums.get(i);
            if (!map.containsKey(key)) {
                map.put(key, 1);
                if (map.size() == k) {
                    trim(map);
                }
            } else {
                int count = map.get(key);
                map.put(key, ++count);
            }
        }

        // reset
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            map.put(entry.getKey(), 0);
        }
        for (int i = 0; i < length; i++) {
            int key = nums.get(i);
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, ++value);
            }
        }

        int maxKey = -1, maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    private void trim(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            map.put(key, --value);
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() == 0) {
                iterator.remove();
            }
        }
    }
}
