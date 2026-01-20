package com.tnsif.intro.collectionsqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Head: " + pq.peek());
        System.out.println("Removed: " + pq.poll());
        System.out.println("Queue after poll: " + pq);
    }
}
