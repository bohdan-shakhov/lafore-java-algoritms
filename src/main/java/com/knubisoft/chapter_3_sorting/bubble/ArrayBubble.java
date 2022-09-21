package com.knubisoft.chapter_3_sorting.bubble;

public class ArrayBubble {

    private int[] array;
    private int elementsCount;

    public ArrayBubble(int size) {
        array = new int[size];
        elementsCount = 0;
    }

    public void insert(int value) {
        array[elementsCount] = value;
        elementsCount++;
    }

    public void display() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void bubbleSort() {
        int out;
        int in;

        for (out = elementsCount - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1])
                    swap(in, in + 1);
            }
        }
    }

    private void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
