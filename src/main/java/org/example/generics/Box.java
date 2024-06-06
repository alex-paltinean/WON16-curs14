package org.example.generics;

public class Box<I> {
    private I item;

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }

    public I doubleTheContent() {
        if (item instanceof String string) {
            return (I) (String.join("", string, string));
        }
        if (item instanceof Integer number) {
            return (I) (new Integer(number + number));
        }
        return null;
    }
}
