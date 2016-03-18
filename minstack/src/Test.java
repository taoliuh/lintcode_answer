/**
 * Created by liutao on 3/17/16.
 */
public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.push(3);
        solution.push(2);
        solution.push(1);
        System.out.print(solution.min() + " ");
        System.out.print(solution.pop() + " ");
        System.out.print(solution.min() + " ");
        System.out.print(solution.pop() + " ");
        System.out.print(solution.min() + " ");
    }
}
