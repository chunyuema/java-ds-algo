package com.chunyue.queue;

public class QueueDemoMain {
    public static void main(String[] args) {
        arrayQueueDemo();
    }

    public static void arrayQueueDemo(){
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(5);
        arrayQueue.enqueue(67);
        arrayQueue.enqueue(89);
        arrayQueue.enqueue(45);
        arrayQueue.enqueue(23);
        arrayQueue.enqueue(908);
        System.out.println("The array queue looks like this: " + arrayQueue);
        try {
            arrayQueue.enqueue(48);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Dequeue from the front: " + arrayQueue.dequeue());
        System.out.println("The array queue looks like this: " + arrayQueue);
        System.out.println("The current front element is: " + arrayQueue.first());
    }
}
