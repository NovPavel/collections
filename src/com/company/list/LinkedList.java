package com.company.list;

import java.util.Arrays;

public class LinkedList implements List {
    private Node root;
    private int size;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Person("Peter", 25));
        linkedList.add(new Person("Ivan", 23));
        linkedList.add(new Person("Kolya", 21));
        System.out.println(linkedList);
        linkedList.remove(1);
        System.out.println(linkedList);
    }

    @Override
    public void add(Object o) {
        Node newNode = new Node(o, null);
        if (isEmpty()) {
            this.root = newNode;
        } else {
            Node temp = this.root;
            while (true) {
                if (temp.next == null) {
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
        size++;
    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public Object get(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        } else {
            int count = 0;
            Node temp = this.root;
            while (true) {
                if (count == index) {
                    return temp.object;
                }
                count++;
                temp = temp.getNext();
            }
        }
    }

    @Override
    public void remove(int index) {
        if (isEmpty()){
            throw new IndexOutOfBoundsException();
        } else {
            int count = 0;
            Node temp = this.root;
            while (true){
                if (count == index - 1){
                    Node r = temp.next.next;
                    Node remove = temp.next;
                    Node l = temp;
                    l.next = r;
                    remove.next = null;
                    remove.object = null;
                    size--;
                    break;
                }
                count++;
                temp = temp.next;
            }
        }
    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public Object set(int index, Object o) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        } else {
            int count = 0;
            Node temp = this.root;
            while (true) {
                if (index == count) {
                    Object object = temp.getObject();
                    temp.setObject(o);
                    return object;
                }
                count++;
                temp = temp.next;
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
        Object[] object = new Object[size];

        Node temp = this.root;
        int index = 0;
        while (temp != null) {
            object[index++] = temp.getObject();
            temp = temp.getNext();
        }
        return object;
    }

    @Override
    public List subList(int from, int to) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] sublist = new Object[to - from];

            int count = 0;
            int index = 0;

            Node temp = this.root;
            while (index < (to - from) - 1) {
                if (count > from && count < to){
                    sublist[index++] = temp.getObject();
                }
                temp = temp.getNext();
                count++;
            }
            return List.asList(sublist);
        }
    }

    private static class Node {
        Object object;
        Node next;

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
        public String toString() {
            return  object + ", " + next ;
        }
    }

    // [Hello 1, Hello 2]
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");

        Node temp = this.root;
        while (true) {
//            stringBuilder.append("")
            temp = temp.getNext();

        }

    }
}
