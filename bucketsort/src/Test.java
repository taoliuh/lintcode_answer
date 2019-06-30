/**
 * Created by liutao on 6/30/19.
 */
public class Test {

   public static void main(String[] args) {
       int[] arrs = {-21473, 0, 90, 403, -1, 8, 13, -500, 97, 13, 8, 2, 98231, -9};
       Solution solution = new Solution();
       solution.bucketSort(arrs);
       for (int num : arrs) {
           System.out.print(num + " ");
       }
   }

}
