package com.knubisoft.chapter_4_stack_queue.stack;

public class CustomStack {

    private int size;
    private int[] stackArray;
    private int top;

    public CustomStack(int size) {
        this.size = size;
        stackArray = new int[size];
        this.top = -1;
    }

    public boolean push(int element) {
        if (top == size - 1)
            return false;

        stackArray[++top] = element;
        return true;
    }

    public int pop() {
        if (top == -1)
            throw new ArrayIndexOutOfBoundsException("there is not a single item in the stack");

        return stackArray[top--];
    }

    public int peek() {
        if (top == -1)
            throw new ArrayIndexOutOfBoundsException("there is not a single itme in the stack");

        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public static void m() {

    }

    public static void m(int i) {

    }

}
