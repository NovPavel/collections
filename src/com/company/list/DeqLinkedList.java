package com.company.list;

public class DeqLinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(Object o) {
        Node newNode = new Node(o, null, null);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node tail = this.tail;
            tail.next = newNode;
            newNode.prev = tail;
            this.tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, Object o) {
        if (index < size / 2) {
            Node temp = this.head;
            int count = 0;
            while (true) {
                if (index == count) {
                    Node newNode = new Node(o, temp, temp.prev);
                    Node prev = temp.prev;
                    prev.next = newNode;
                    newNode.next = temp;
                    temp.prev = newNode;
                    size++;
                    break;
                }
                temp = temp.next;
                count++;
            }
        }
        else {
            Node temp = this.tail;
            int count = size;
            while (true) {
                if (index == count) {
                    Node newNode = new Node(o, temp, temp.prev);
                    Node prev = temp.prev;
                    prev.next = newNode;
                    newNode.next = temp;
                    temp.prev = newNode;
                    size++;
                    break;
                }
                temp = temp.prev;
                count--;
            }

        }

    }

    @Override
    public Object get(int index) {
        if (index < size / 2) {
            int count = 0;
            Node temp = this.head;
            while (true) {
                if (index == count) {
                    return temp.element;
                }
                temp = temp.next;
                count++;
            }
        } else {
            int count = this.size - 1;
            Node temp = this.tail;
            while (true) {
                if (index == count) {
                    return temp.element;
                }
                temp = temp.prev;
                count--;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index < size / 2) {
            Node temp = this.head;
            int count = 0;
            while (true) {
                if (index == count) {
                    Node left = temp.getPrev();
                    Node right = temp.getNext();
                    left.next = right;
                    right.prev = left;
                    temp.next = null;
                    temp.prev = null;
                    temp.element = null;
                    size--;
                    break;
                }
                temp = temp.next;
                count++;
            }
        } else {
            Node temp = this.tail;
            int count = 0;
            while (true) {
                if (index == count) {
                    Node left = temp.getPrev();
                    Node right = temp.getNext();
                    left.next = right;
                    right.prev = left;
                    temp.next = null;
                    temp.prev = null;
                    temp.element = null;
                    size--;
                    break;
                }
                temp = temp.prev;
                count--;
            }
        }
    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public Object set(int index, Object o) {
        if (index > size / 2) {
            Node temp = this.head;
            int count = 0;
            while (true) {
                if (index == count) {
                    Object olf = temp.getElement();
                    temp.setElement(o);
                    return olf;
                }
                temp = temp.next;
                count++;
            }
        } else {
            int count = this.size - 1;
            Node temp = this.tail;
            while (true) {
                if (index == count) {
                    Object old = temp.getElement();
                    temp.setElement(o);
                    return old;
                }
                temp = temp.prev;
                count--;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object[] toArray() {
        Node temp = this.head;
        Object[] elements = new Object[size];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = temp.getElement();
            temp = temp.next;
        }
        return elements;
    }

    @Override
    public List subList(int from, int to) {
        List elements = new LinkedList();
        Node temp = this.head;
        for (int i = 0; i < elements.size(); i++) {
            if (i == from && i <= to) {
                elements.add(i, temp.getElement());
                temp = temp.next;
            }
        }
        return elements;
    }

    @Override
    public String toString() {
        return "DeqLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }

    private static class Node {
        Object element;
        Node next;
        Node prev;

        public Node(Object element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public Object getElement() {
            return element;
        }

        public void setElement(Object element) {
            this.element = element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
//                    ", prev=" + prev +
                    '}';
        }
    }
}
