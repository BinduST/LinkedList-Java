/**
 * Created on 01/03/16.
 */
public class Node<E> {
    E value = null;
    protected Node<E> previous;
    protected Node<E> next;

    public Node(E value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }
}