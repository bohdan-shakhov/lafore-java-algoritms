package com.knubisoft.chapter_3_sorting.select;

public class SelectSortRunner {
    public static void main(String[] args) {
        ArraySelect arraySelect = new ArraySelect(5);
        arraySelect.insert(4);
        arraySelect.insert(6);
        arraySelect.insert(1);
        arraySelect.insert(10);
        arraySelect.insert(2);

        System.out.println("Array before sorting: ");
        arraySelect.display();

        arraySelect.selectionSort();

        System.out.println("Array after sorting: ");
        arraySelect.display();
    }
}
