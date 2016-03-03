/**
 * Created on 01/03/16.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void add_method_adds_integer_to_the_linkedList() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertTrue(list.add(1));
        assertTrue(list.add(2));
    }

    @Test
    public void add_method_adds_string_to_the_linkedList() throws Exception {
        MyLinkedList<String> list = new MyLinkedList<>();
        assertTrue(list.add("Hello"));
        assertTrue(list.add("World"));
    }

    @Test
    public void add_floating_point_numbers_to_list() throws Exception {
        MyLinkedList<Double> list = new MyLinkedList<>();
        list.add(2.2);
        list.add(5.4);
        assertEquals(null,list.get(4));
    }

    @Test
    public void get_method_gives_the_element_in_specified_index() throws Exception {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("Hello");
        list.add("World");
        String element = list.get(1);
        assertEquals("World",element);
    }

    @Test
    public void get_method_gives_null_if_index_is_greater_than_size() throws Exception {
        MyLinkedList<Double> list = new MyLinkedList<>();
        list.add(2.2);
        list.add(5.4);
        assertEquals(null,list.get(4));
    }

    @Test
    public void get_method_gives_element_in_specified_index() throws Exception {
        MyLinkedList<Double> list = new MyLinkedList<>();
        list.add(2.2);
        list.add(5.4);
        double val = list.get(1);
        assertEquals(5.4,val,0);
    }

    @Test
    public void addFirst_adds_element_first() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        assertTrue(list.addFirst(5));
    }

    @Test
    public void addFirst_for_an_empty_list() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertTrue(list.addFirst(5));
    }

    @Test
    public void addLast_for_an_existing_list() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(3);
        list.add(1);
        list.addLast(1);
        assertTrue(list.addLast(5));
    }

    @Test
    public void addLast_for_an_empty_list() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        assertTrue(list.addLast(5));
    }

    @Test
    public void contains_returns_false_if_element_is_absent() throws Exception {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("is");
        list.add("a");
        list.addFirst("this");
        list.addLast("sample");
        assertFalse(list.contains("ok"));
    }

    @Test
    public void remove_removes_the_first_element() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(8);
        int removedElement = list.remove(0);
        assertEquals(2,removedElement);
    }

    @Test
    public void remove_removes_an_element_in_given_index() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(8);
        int removedElement = list.remove(2);
        assertEquals(4,removedElement);
    }

    @Test
    public void remove_removes_the_last_element() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(8);
        int removedElement = list.remove(3);
        assertEquals(8,removedElement);
    }

    @Test
    public void hasNext_returns_true_if_next_element_is_present() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.hasNext());
    }

    @Test
    public void hasNext_for_list_which_has_one_element() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        assertTrue(list.hasNext());
    }

    @Test
    public void next_returns_the_next_element_if_next_element_is_present() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int nextElement = list.next();
        assertEquals(1, nextElement);
    }

    @Test
    public void next_returns_the_null_element() throws Exception {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int nextElement = list.next();
        assertEquals(1, nextElement);
    }
}

