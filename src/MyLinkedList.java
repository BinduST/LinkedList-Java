public class MyLinkedList<E> implements MyListIterator<E> {

    private Node<E> first = null;
    private Node<E> last = null;
    private int size = 0;
    private int nextIndex;
    private Node<E> nextNode;

    public boolean add(E i) {
        Node<E> newNode = new Node<>(i);
        if (size == 0) first = last = newNode;
        else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }
        size++;
        return true;
    }

    public E get(int i) {
        Node<E> node = first;
        for (int index = 0; index < size; index++) {
            if (i == index) return node.value;
            node = node.next;
        }
        return null;
    }

    public boolean addFirst(E i) {
        Node<E> newNode = new Node<>(i);
        if (size == 0) first = last = newNode;
        else {
            first.previous = newNode;
            newNode.next = first;
            first = newNode;
        }
        size++;
        return true;
    }

    public boolean addLast(E i) {
        Node<E> newNode = new Node<>(i);
        if (size == 0) first = last = newNode;
        else {
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
        size++;
        return true;
    }

    public boolean contains(E i) {
        Node<E> node = first;
        for (int index = 0; index < size; index++) {
            if (node.value == i) return true;
            node = node.next;
        }
        return false;
    }

    public E remove(int i) {
        Node<E> node = first;
        for (int index = 0; index < size; index++) {
            if (i == 0) {
                node.next.previous = node.previous;
                size--;
                return node.value;
            }
            if (i == size - 1) {
                last.previous.next = last.next;
                size--;
                return last.value;
            }
            if (index == i) {
                node.next.previous = node.previous;
                node.previous.next = node.next;
                size--;
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < size;
    }

    @Override
    public E next() {
        if (nextIndex == size) return null;
        if (nextIndex == 0) nextNode = first;
        Node<E> currentNode = nextNode;
        nextNode = nextNode.next;
        nextIndex++;
        return currentNode.value;
    }
}