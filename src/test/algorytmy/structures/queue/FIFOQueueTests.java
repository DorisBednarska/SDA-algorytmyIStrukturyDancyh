package test.algorytmy.structures.queue;

import algorytmy.structures.queue.FIFOQueue;
import algorytmy.structures.queue.Queue;

/**
 * Created by RENT on 2017-02-18.
 */
public class FIFOQueueTests {
    public static void main(String[] args) {
        Queue queue = new FIFOQueue();
        queue.push(2);
        queue.push(1);
        queue.push(0);
        queue.push(4);
        System.out.println(queue);
        System.out.println();

        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println(queue);
        queue.push(3);
        queue.push(8);
        System.out.println(queue);

        System.out.println();
        System.out.println(queue.clone());
        System.out.println();

        Queue clonedQueue = queue.clone();
        System.out.println(clonedQueue);
        clonedQueue.pop();
        System.out.println(queue);
        System.out.println(clonedQueue);
    }
}
