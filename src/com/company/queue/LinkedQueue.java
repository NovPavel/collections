package com.company.queue;

import java.util.Objects;

public class LinkedQueue implements Queue {
    private Node head;
    private Node tail;
    private int size = 0;

    @Override
    public boolean add(Object object) {
        Node node1 = new Node(object, null);
        if (size == 0) {
            Node node = node1;
            this.head = node;
            this.tail = node;
        } else {
            Node newNode = node1;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean offer(Object object) {
        Node node1 = new Node(object, null);
        if (size == 0) {
            Node node = node1;
            this.head = node;
            this.tail = node;
        } else {
            Node newNode = node1;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public Object remove() {
        if (size == 0) {
            throw new IllegalStateException();
        } else {
            Node head = this.head;
            this.head = head.next;
            Object old = head.object;
            head.next = null;
            head.object = null;
            return old;
        }
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return this.head.object;
    }

    private static class Node {
        Object object;
        Node next;

        public Node() {
        }

        public Node(Object object, Node next) {
            this.object = object;
            this.next = next;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(object, node.object) &&
                    Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(object, next);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "object=" + object +
                    ", next=" + next +
                    '}';
        }
    }

}
