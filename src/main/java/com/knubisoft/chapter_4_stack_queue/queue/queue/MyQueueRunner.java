package com.knubisoft.chapter_4_stack_queue.queue.queue;

public class MyQueueRunner {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);

        while (!queue.isEmpty()) {
            long n = queue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();
    }
}
