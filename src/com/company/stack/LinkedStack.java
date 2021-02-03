package com.company.stack;

public class LinkedStack implements Stack {

    private Node root;
    private int size = 0;

    public LinkedStack() {
    }

    public LinkedStack(Stack stack) {

    }


    @Override
    public Object push(Object object) {
        if (empty()) {
            this.root = new Node(null, object);
        } else {
            Node root = this.root;
            this.root = new Node(root, object);
        }
        size++;
        return object;

    }

    @Override
    public Object pop() {
        Object old;
        if (empty()) {
            throw new NullPointerException();
        } else {
            Node root = this.root;
            Node next = root.next;
            old = root.item;
            this.root = next;
        }
        size--;
        return old;
    }

    @Override
    public Object peek() {
        if (empty()) {
            throw new NullPointerException();
        }
        return this.root.getItem();
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public int search(Object object) {
        if (empty()) {
            throw new NullPointerException();
        } else {
            int count = 0;
            Node root = this.root;
            while (root != null) {
                if (root.getItem().equals(object)) {
                    return count;
                }
                root = root.next;
                count++;
            }
        }
        return -1;
    }

    public void linkedStackCopyOfMassive(Object[] objects){
        for (int i = 0; i < objects.length; i++) {
            this.push(objects[i]);
        }
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }

    private static class Node {
        Node next;
        Object item;

        public Node(Node next, Object item) {
            this.next = next;
            this.item = item;
        }

        public Node() {
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", item=" + item +
                    '}';
        }
    }

}
