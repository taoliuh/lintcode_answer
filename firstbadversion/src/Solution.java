/**
 *
 * The code base version is an integer start from 1 to n. One day,
 * someone committed a bad version in the code case, so it caused
 * this version and the following versions are all failed in the
 * unit tests. Find the first bad version.
 *
 * You can call isBadVersion to help you determine which version is
 * the first bad one. The details interface can be found in the code's annotation part.
 *
 * Example
 * Given n = 5:
 *
 * isBadVersion(3) -> false
 * isBadVersion(5) -> true
 * isBadVersion(4) -> true
 * Here we are 100% sure that the 4th version is the first bad version.
 * Created by liutao on 8/29/15.
 */
public class Solution {
    public int findFirstBadVersion(int n) {
        if (n == 0) {
            return 0;
        }
        int start = 1;
        int end = n;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (VersionControl.isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (VersionControl.isBadVersion(start)) {
            return start;
        } else if (VersionControl.isBadVersion(end)) {
            return end;
        }
        return 0;
    }

}
