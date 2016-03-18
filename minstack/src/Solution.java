import java.util.ArrayDeque;

/**
 * Created by liutao on 3/17/16.
 */
public class Solution {
    private ArrayDeque<Integer> stack;
    private ArrayDeque<Integer> minStack;

    public Solution() {
        // do initialize if necessary
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int number) {
        // write your code here
        stack.push(number);
        if (minStack.isEmpty()) {
            minStack.push(number);
        } else {
            minStack.push(Math.min(number, minStack.peek()));
        }
    }

    public int pop() {
        // write your code here
        int element = stack.pop();
        if (minStack.peek().equals(element)) {
            minStack.pop();
        }
        return element;
    }

    public int min() {
        // write your code here
        return minStack.peek();
    }
}
