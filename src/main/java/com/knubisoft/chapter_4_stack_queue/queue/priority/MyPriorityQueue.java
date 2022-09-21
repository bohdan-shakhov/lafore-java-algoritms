package com.knubisoft.chapter_4_stack_queue.queue.priority;

public class MyPriorityQueue {

    private int maxSize;
    private long[] queArray;
    private int elementsCount;

    public MyPriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        elementsCount = 0;
    }

    public void insert(long elem) {
        int j;

        if (elementsCount == 0)
            queArray[elementsCount++] = elem;
        else {
            for (j = elementsCount - 1; j >= 0; j--) {
                if (elem > queArray[j])
                    queArray[j + 1] = queArray[j];
                else
                    break;
            }
            queArray[j + 1] = elem;
            elementsCount++;
        }
    }

    public long remove() {
        return queArray[--elementsCount];
    }

    public long peekMin() {
        return queArray[elementsCount - 1];
    }

    public boolean isEmpty() {
        return elementsCount == 0;
    }

    public boolean isFull() {
        return elementsCount == maxSize;
    }
}
