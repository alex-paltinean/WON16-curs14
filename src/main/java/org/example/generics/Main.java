package org.example.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OldBox oldBox = new OldBox();
//        oldBox.setItem("sosete");
//        oldBox.setItem(123);
        oldBox.setItem(new ArrayList<>());

        Object item = oldBox.getItem();
        if (item instanceof String string) {
            string.toUpperCase();
        }

        Box<String> boxWithString = new Box<>();
        boxWithString.setItem("abc");
        String item1 = boxWithString.getItem();
        System.out.println(boxWithString.doubleTheContent());

        Box<Integer> boxWithNumber = new Box<>();
        boxWithNumber.setItem(123);
        Integer item2 = boxWithNumber.getItem();
        System.out.println(boxWithNumber.doubleTheContent());

        Box<Long> boxWithLong = new Box<>();
        boxWithLong.setItem(144L);
        System.out.println(boxWithLong.doubleTheContent());

        IntegerBox<Integer> integerBox = new IntegerBox<>(22345);
        System.out.println(integerBox.isItLarger(133));

        Pair<String, Long> stringStringPair = new Pair<>("asb", 123L);
    }
}
