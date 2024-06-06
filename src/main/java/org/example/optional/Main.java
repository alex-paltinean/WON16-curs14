package org.example.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        Optional<Integer> max = getMax(list);
        System.out.println(max.orElse(0) * 2);

    }

    public static Optional<Integer> getMax(List<Integer> list) {
        Optional<Integer> max = Optional.empty();
        for (Integer item : list) {
            if (max.isEmpty() || item > max.get()) {
                max = Optional.of(item);
            }
        }
        return max;
    }
}
