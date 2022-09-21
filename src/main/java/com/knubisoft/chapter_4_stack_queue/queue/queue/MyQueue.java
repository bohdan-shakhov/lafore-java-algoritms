package com.knubisoft.chapter_4_stack_queue.queue.queue;

public class MyQueue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int elementsCount;

    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        elementsCount = 0;
    }

    public void insert(long elem) {
        if (rear == maxSize - 1)
            rear = -1;

        queArray[++rear] = elem;
        elementsCount++;
    }

    public long remove() {
        long temp = queArray[front++];

        if (front == maxSize)
            front = 0;

        elementsCount--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return elementsCount == 0;
    }

    public boolean isFull() {
        return elementsCount == maxSize;
    }

    public int size() {
        return elementsCount;
    }
}
