package com.knubisoft.chapter_2_arrays.array.oop;

public class Array {
    private final int[] arr;
    private int elementsCount;

    public Array(int size) {
        this.arr = new int[size];
        elementsCount = 0;
    }

    public boolean find(int element) {
        int j;
        for (j = 0; j < elementsCount; j++)
            if (arr[j] == element)
                break;

        return !(j == elementsCount);
    }

    public void insert(int element) {
        arr[elementsCount] = element;
        elementsCount++;
    }

    public boolean delete(int element) {
        int j;
        for (j = 0; j < elementsCount; j++)
            if (element == arr[j])
                break;

        if (j == elementsCount)
            return false;
        else {
            for (int k = j; k < elementsCount; k++)
                arr[k] = arr[k + 1];
            elementsCount--;
            return true;
        }
    }

    public void display() {
        for (int j = 0; j < elementsCount; j++)
            System.out.print(arr[j] + " ");
        System.out.println();
    }
}
