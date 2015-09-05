/**
 * Created by liutao on 9/5/15.
 */
public class Test {
    public static void main(String[] args) {
        char[] str = new char[] {'c', 'p', 'p', 'j', 'a', 'v', 'a', 'p', 'y'};
        Solution solution = new Solution();
        solution.rotateString(str, 25);
        for (int i = 0; i < str.length; i++) {
            if (i == str.length - 1) {
                System.out.print(str[i]);
            } else {
                System.out.print(str[i] + ", ");
            }
        }
    }
}
