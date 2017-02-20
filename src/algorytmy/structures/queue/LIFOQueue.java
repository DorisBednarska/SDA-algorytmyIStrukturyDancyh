package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-20.
 */
public class LIFOQueue extends AbstractQueue {

    public static LIFOQueue newInstance() {  //fabryka
        return new LIFOQueue();
    }

    public LIFOQueue() {
    }

    @Override
    protected AbstractQueue getInstance() {
        return new LIFOQueue();
    }

    @Override
    protected AbstractQueue getInstance(int value) {
        return new LIFOQueue(value);
    }

    public LIFOQueue(int value) {
        super(value); //wywołujemy cos co juz zostalo wywolane, cos jak this.value, tylko this juz bylo wczesniej uzyte do tego samego
    }

    @Override
    public void push(int value) {
        AbstractQueue nextValue = this.next; //dostajemy sie do pierwszego elementu za glowa
        LIFOQueue newValue = new LIFOQueue(value); //tworzymy nowy klocek który wstawimy
        this.next = newValue; //wstawiamy element
        newValue.next = nextValue; //wstawiamy element
    }
}
