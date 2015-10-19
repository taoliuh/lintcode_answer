/**
 * Created by liutao on 10/19/15.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[] {17,8,29,17,35,28,14,2,45,8,6,54,24,43,20,14,33,31,27,11};
        Solution solution = new Solution();
        int result = solution.minimumJump(array);
        System.out.printf("Result is %d", result);
    }
}
