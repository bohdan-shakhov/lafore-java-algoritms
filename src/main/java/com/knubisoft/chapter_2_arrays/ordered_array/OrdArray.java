package com.knubisoft.chapter_2_arrays.ordered_array;

public class OrdArray {
    private final int[] arr;
    private int elementsCount;

    public OrdArray(int size) {
        this.arr = new int[size];
    }

    public int size() {
        return elementsCount;
    }

    public int find(int element) {
        int lowerBound = 0;
        int upperBound = elementsCount - 1;
        int current;

        while (true) {
            current = (lowerBound + upperBound) / 2;
            if (arr[current] == element)
                return current;
            else if (lowerBound > upperBound)
                return -1;
            else {
                if (arr[current] < element)
                    lowerBound = current + 1;
                else
                    upperBound = current - 1;
            }
        }
    }

    public void insert(int element) {
        int j;
        for (j = 0; j < elementsCount; j++)
            if (arr[j] > element)
                break;
        for (int k = elementsCount; k > j; k--)
            arr[k] = arr[k - 1];
        arr[j] = element;
        elementsCount++;
    }

    public boolean delete(int element) {
        int j = find(element);
        if (j == -1)
            return false;
        else {
            for (int k = j; k < elementsCount - 1; k++)
                arr[k] = arr[k + 1];
            elementsCount--;
        }
        return true;
    }

    public void display() {
        for (int i = 0; i < elementsCount; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
