package com.knubisoft.chapter_3_sorting.insertion;

public class InsertionSortRunner {
    public static void main(String[] args) {
        ArrayInsert arrayInsert = new ArrayInsert(5);

        arrayInsert.insert(1);
        arrayInsert.insert(10);
        arrayInsert.insert(3);
        arrayInsert.insert(8);
        arrayInsert.insert(5);

        System.out.println("Array before sorting: ");
        arrayInsert.display();

        arrayInsert.insertionSort();

        System.out.println("Array after sorting: ");
        arrayInsert.display();
    }
}
