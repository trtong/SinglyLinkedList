package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    private int size;
    private class Node<T> {

        private T data;
        private Node<T> address;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node<T> address) {
            this.data = data;
            this.address = address;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getAddress() {
            return address;
        }

        public void setAddress(Node<T> address) {
            this.address = address;
        }
    }

    // singly linkedlist of T, only including nodes of T

    private Node<T> head;

    public SinglyLinkedList(Node<T> head) {
        this.head = head;
    }

    public SinglyLinkedList() {
    }

    public void add(T data){
        size++;
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> tail = head;

            while (tail.getAddress() != null) {
                tail = tail.getAddress();
            }

            tail.setAddress(new Node<T>(data));
        }
    }

    public void remove(int index) {
        // for loop when i = index
        // remove that node
        // link the prior nodes address to the node after the removed one
        if (index < 0 || index >= size) {
            throw new RuntimeException("Node does not exist within bounds.");
        } else {
            Node<T> cur = head;
            Node<T> prior = null;

            for (int i = 0; i < index; i++) {
                prior = cur;
                cur = cur.getAddress();
            }

            if (prior == null) {
                head = cur.getAddress();
            } else {
                prior.setAddress(cur.getAddress());
            }
            size--;
        }

    }

    public boolean contains() {
        return false;
    }

    public int find() {
        return 0;
    }

    public Integer size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Node does not exist within bounds.");
        } else {
            Node<T> cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.getAddress();
            }

            return cur.getData();
        }
    }

    public SinglyLinkedList<T> copy(SinglyLinkedList<T> list) {
        return null;
    }

    public SinglyLinkedList<T> sort(SinglyLinkedList<T> list) {
        return null;
    }

}
