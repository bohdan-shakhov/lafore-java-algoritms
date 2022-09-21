package com.knubisoft.chapter_3_sorting.select;

public class ArraySelect {
    private int[] array;
    private int elementsCount;

    public ArraySelect(int size) {
        array = new int[size];
        elementsCount = 0;
    }

    public void insert(int value) {
        array[elementsCount] = value;
        elementsCount++;
    }

    public void display() {
        for (int e :
                array) {
            System.out.print(e + " ");
        }
        System.out.println("");
    }

    public void selectionSort() {
        int out;
        int in;
        int min;
        for (out = 0; out < elementsCount - 1; out++) {
            min = out;
            for (in = out + 1; in < elementsCount; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
                swap(out, min);
            }
        }
    }

    private void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
