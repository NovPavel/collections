package com.company.deque;

import java.util.Arrays;

public class ArrayDeque implements Deque {
    private Object[] arrays = new Object[10];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast("Hello 1");
        arrayDeque.addLast("Hello 2");
        arrayDeque.addLast("Hello 3");
        arrayDeque.addLast("Hello 4");
        arrayDeque.addLast("Hello 5");
        arrayDeque.addLast("Hello 6");
        arrayDeque.addLast("Hello 7");
        arrayDeque.addLast("Hello 8");
        arrayDeque.addLast("Hello 9");
        arrayDeque.addLast("Hello 10");
        arrayDeque.pollLast();


        System.out.println(arrayDeque);
    }

    @Override
    public boolean addFirst(Object object) {
        return false;
    }

    @Override
    public boolean addLast(Object object) {
        if (this.tail == arrays.length){
            this.tail = 0;
        }
        if (arrays[this.tail] != null) return false;
        arrays[this.tail++] = object;
        size++;
        return true;
    }

    @Override
    public boolean offerFirst(Object object) {
        return false;
    }

    @Override
    public boolean offerLast(Object object) {
        return false;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object pollFirst() {
        return null;
    }

    @Override
    public Object pollLast() {
        if (tail == 0){
            tail = arrays.length;
        }
        Object removedLast = arrays[tail - 1];
        arrays[tail-- - 1] = null;
        size--;
        return removedLast;
    }

    @Override
    public Object elementFirst() {
        return null;
    }

    @Override
    public Object elementLast() {
        return null;
    }

    @Override
    public Object peekFirst() {
        return null;
    }

    @Override
    public Object peekLast() {
        return null;
    }

    @Override
    public boolean add(Object object) {
        return addLast(object);
    }

    @Override
    public boolean offer(Object object) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
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
    public Object push(Object object) {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public int search(Object object) {
        return 0;
    }

    @Override
    public String toString() {
        return "ArrayDeque{" +
                "arrays=" + Arrays.toString(arrays) +
                ", head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
