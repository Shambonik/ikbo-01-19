
/**
 * @param <E> - generics type for list
 */
public class BoundedWaitList<E> extends WaitList<E>{

    private int capacity;

    /**
     * @param capacity - capacity of list
     */
    public BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }

    /**
     * @return the capacity of list
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param element - to add
     */
    @Override
    public void add(E element) {
        if (content.size() < capacity) {
            content.add(element);
        }
    }

    /**
     * @return the object
     */
    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
