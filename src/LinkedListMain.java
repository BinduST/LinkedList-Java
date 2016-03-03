/**
 * Created on 02/03/16.
 */
public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Object> list = new MyLinkedList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        while (list.hasNext()) {
            System.out.println("list = " + list.next());
        }
    }
}
