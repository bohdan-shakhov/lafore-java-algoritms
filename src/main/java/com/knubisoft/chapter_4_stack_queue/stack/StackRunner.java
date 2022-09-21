package com.knubisoft.chapter_4_stack_queue.stack;

public class StackRunner {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(10);
        System.out.println(customStack.isEmpty());
        System.out.println(customStack.isFull());
        System.out.println("-------------------------");

        customStack.pop();
    }
}
