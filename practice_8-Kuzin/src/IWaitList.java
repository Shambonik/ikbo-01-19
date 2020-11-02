import java.util.Collection;

/**
 * @param <E> - generics type for list
 */
public interface IWaitList<E> {

    /**
     * @param element to add
     */
    void add(E element);

    /**
     * @return removed element
     */
    E remove();

    /**
     * @param element to check if it contains
     * @return true if contains
     */
    boolean contains(E element);

    /**
     * @param c - to check if list contains in custom list
     * @return true if list contains
     */
    boolean containsAll(Collection<E> c);

    /**
     * @return true if list is empty
     */
    boolean isEmpty();
}
