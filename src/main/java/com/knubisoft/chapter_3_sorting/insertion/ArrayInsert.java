package com.knubisoft.chapter_3_sorting.insertion;

public class ArrayInsert {
    private int[] array;
    private int elementsCount;

    public ArrayInsert(int size) {
        array = new int[size];
        elementsCount = 0;
    }

    public void insert(int value) {
        array[elementsCount] = value;
        elementsCount++;
    }

    public void display() {
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }

    public void insertionSort() {
        int in;
        int out;
        for (out = 1; out < elementsCount; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
    }
}
