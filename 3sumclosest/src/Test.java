/**
 * Created by liutao on 3/12/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] numbers = {-2,-3,-4,-5,-100,99,1,4,4,4,5,1,0,-1,2,3,4,5};
        Solution solution = new Solution();
        int result = solution.threeSumClosest(numbers, 77);
        System.out.print(result);
    }
}
