package org.example.generics;

public class IntegerBox<I extends Number> {
    private final I item;

    public IntegerBox(I item) {
        this.item = item;
    }

    public I getItem() {
        return item;
    }

    public boolean isItLarger(Number n) {
        return item.doubleValue() > n.doubleValue();
    }
}
