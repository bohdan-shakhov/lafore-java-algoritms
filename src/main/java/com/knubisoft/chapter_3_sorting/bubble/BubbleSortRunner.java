package com.knubisoft.chapter_3_sorting.bubble;

public class BubbleSortRunner {
    public static void main(String[] args) {
        ArrayBubble arrayBubble = new ArrayBubble(5);
        arrayBubble.insert(3);
        arrayBubble.insert(10);
        arrayBubble.insert(1);
        arrayBubble.insert(6);
        arrayBubble.insert(4);
        System.out.println("Array before sorting: ");
        arrayBubble.display();
        arrayBubble.bubbleSort();
        System.out.println("Array after sorting: ");
        arrayBubble.display();
    }
}
