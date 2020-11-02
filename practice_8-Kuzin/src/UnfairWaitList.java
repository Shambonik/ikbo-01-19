/**
 * @param <E> - generics type for list
 */
public class UnfairWaitList<E> extends WaitList<E>{

    public UnfairWaitList() {
        super();
    }

    /**
     * @param element - remove
     */
    public void remove(E element) {
        content.remove(element);
    }

    /**
     * @param element - add to back
     */
    public void moveToBack(E element){
        remove(element);
        super.add(element);
    }
}
