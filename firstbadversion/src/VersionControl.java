import java.util.Random;

/**
 * Created by liutao on 8/29/15.
 */
public class VersionControl {
    private static int threshold = new Random().nextInt(10);
    public static boolean isBadVersion(int commit) {
        return commit / threshold > 0;
    }
}
