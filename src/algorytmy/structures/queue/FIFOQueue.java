package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-18.
 */


public class FIFOQueue extends AbstractQueue {

    private FIFOQueue(int value) {
        super(value);
    }

    public FIFOQueue() {
    }

    @Override
    protected AbstractQueue getInstance() {
        return new FIFOQueue();
    }

    @Override
    protected AbstractQueue getInstance(int value) {
        return new FIFOQueue(value);
    }

    @Override
    public void push(int value) {
        AbstractQueue last = getLast();
        last.next = new FIFOQueue(value);

    }

    private AbstractQueue getLast() {
        AbstractQueue fifoQueue = this;
        while (fifoQueue.next != null) {
            fifoQueue = fifoQueue.next;
        }
        return fifoQueue;
    }
}
