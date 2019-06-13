package me.sonaive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liutao on 02/04/2019.
 */
public class Test {
    public static void main(String[] args) {
        DataStream stream = new DataStream();
        test(stream);
    }

    private static void test(DataStream stream) {
        List<Integer> result = new ArrayList<>();
        stream.add(5);
        result.add(stream.firstUnique());
        result.add(stream.firstUnique());
        stream.add(11);
        stream.add(2);
        stream.add(24);
        result.add(stream.firstUnique());
        stream.add(21);
        result.add(stream.firstUnique());
        result.add(stream.firstUnique());
        result.add(stream.firstUnique());
        print(result);
    }

    private static void print(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i = 0, size = list.size(); i < size; i++) {
            if (i == size - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
