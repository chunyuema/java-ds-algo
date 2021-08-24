package test;

import com.chunyue.deque.DoublyLinkedListDeque;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListDequeTest {

    private static DoublyLinkedListDeque<Integer> doublyLinkedListDeque = new DoublyLinkedListDeque<>();
    private static DoublyLinkedListDeque<String> doublyLinkedListDequeString = new DoublyLinkedListDeque<>();

    @BeforeAll
    public static void init(){
        doublyLinkedListDeque.addFirst(3);
        doublyLinkedListDeque.addFirst(33);
        doublyLinkedListDeque.addFirst(333);
        doublyLinkedListDeque.addLast(5);
        doublyLinkedListDeque.addLast(55);
        doublyLinkedListDeque.addLast(555);
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(doublyLinkedListDeque.size(), 6);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertFalse(doublyLinkedListDeque.isEmpty());
        assertTrue(doublyLinkedListDequeString.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void first() {
        assertEquals(doublyLinkedListDeque.first(), 333);
        assertEquals(doublyLinkedListDequeString.first(), null);
    }

    @org.junit.jupiter.api.Test
    void last() {
        assertEquals(doublyLinkedListDeque.last(), 555);
        assertNull(doublyLinkedListDequeString.last());
    }

    @org.junit.jupiter.api.Test
    void addFirst() {
        doublyLinkedListDeque.addFirst(456);
        assertEquals(doublyLinkedListDeque.first(), 456);
    }

    @org.junit.jupiter.api.Test
    void addLast() {

    }

    @org.junit.jupiter.api.Test
    void removeFirst() {
    }

    @org.junit.jupiter.api.Test
    void removeLast() {
    }
}