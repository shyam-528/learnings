/**
 * 03 - SinglyLinkedList
 * A from-scratch singly linked list: add, insert at index, delete, reverse.
 *
 * Concepts: nodes, references, traversal, pointer rewiring, generics.
 *
 * Run:
 *   javac SinglyLinkedList.java
 *   java SinglyLinkedList
 *
 * Sample output:
 *   List: 10 -> 20 -> 30
 *   After insert: 10 -> 15 -> 20 -> 30
 *   After delete: 10 -> 15 -> 30
 *   Reversed: 30 -> 15 -> 10
 */
public class SinglyLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    private Node<T> head;
    private int size;

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
        size++;
    }

    public void insertAt(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        Node<T> node = new Node<>(data);
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node<T> cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            node.next = cur.next;
            cur.next = node;
        }
        size++;
    }

    public boolean delete(T data) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> cur = head;
        while (cur.next != null && !cur.next.data.equals(data)) {
            cur = cur.next;
        }
        if (cur.next == null) {
            return false;
        }
        cur.next = cur.next.next;
        size--;
        return true;
    }

    public void reverse() {
        Node<T> prev = null, cur = head;
        while (cur != null) {
            Node<T> next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<T> cur = head; cur != null; cur = cur.next) {
            sb.append(cur.data);
            if (cur.next != null) {
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List: " + list);
        list.insertAt(1, 15);
        System.out.println("After insert: " + list);
        list.delete(20);
        System.out.println("After delete: " + list);
        list.reverse();
        System.out.println("Reversed: " + list);
    }
}
