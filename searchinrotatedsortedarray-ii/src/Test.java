/**
 * Created by liutao on 9/4/15.
 */
public class Test {

    public static void main(String[] args) {
        int[] array = new int[] {9, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9};
        Solution solution = new Solution();
        int index = solution.find2(array, 8);
        System.out.printf("Index is %d", index);
    }
}
