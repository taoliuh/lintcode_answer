import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        char[] chs = "Mr John Smith".toCharArray();
        char[] chars = Arrays.copyOf(chs, 100);
        Solution solution = new Solution();
        int newLength = solution.replaceBlank(chars, 13);
        String replacement = new String(chars, 0, newLength);
        System.out.print("newLength=" + newLength + ", replacement=" + replacement);
    }
}
