package com.knubisoft.chapter_7_upgrade_sorting.shell;

public class ArrayShell {
    private long[] theArray;
    private int elementsCount;

    public ArrayShell(int size) {
        this.theArray = new long[size];
        this.elementsCount = 0;
    }

    public void insert(long value) {
        theArray[elementsCount] = value;
        elementsCount++;
    }

    public void display() {
        for (int i = 0; i < elementsCount; i++)
            System.out.print(theArray[i] + " ");

        System.out.println();
    }

    public void shellSort() {
        int inner, outer;
        long temp;
        int h = 1;

        while (h <= elementsCount / 3)
            h = h * 3 + 1; // 1, 4, 13, 40, 121, ...

        while (h > 0) {
            for (outer = h; outer < elementsCount; outer++) {
                temp = theArray[outer];
                inner = outer;

                while (inner > h - 1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner - h];
                    inner -= h;
                }

                theArray[inner] = temp;
            }

            h = (h - 1) / 3;
        }
    }
}
