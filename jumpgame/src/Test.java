/**
 * Created by liutao on 10/19/15.
 */
public class Test {
    public static void main(String[] args) {
//        int[] array = new int[] {3, 2, 1, 0, 4};
        int[] array = new int[] {5,8,3,0,6,7,9,6,3,4,5,2,0,6,2,6,7,10,8,0};
        Solution solution = new Solution();
        boolean result = solution.canJump(array);
        System.out.printf("Result is %s", result);
    }
}
