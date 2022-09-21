package com.knubisoft.chapter_4_stack_queue.queue.priority;

public class MyPriorityQueueRunner {
    public static void main(String[] args) {
        MyPriorityQueue priorityQueue = new MyPriorityQueue(5);
        priorityQueue.insert(30);
        priorityQueue.insert(50);
        priorityQueue.insert(10);
        priorityQueue.insert(40);
        priorityQueue.insert(20);

        while (!priorityQueue.isEmpty()) {
            long item = priorityQueue.remove();
            System.out.print(item + " ");
        }
    }
}
