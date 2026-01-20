package com.tnsif.intro.collectionsqueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Red");
        queue.offer("Green");
        queue.offer("Blue");

        System.out.println("Queue: " + queue);

        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}

