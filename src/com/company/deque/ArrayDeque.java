package com.company.deque;

import com.company.stack.Stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayDeque implements Deque {
    private Object[] arrays = new Object[10];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public static void main(String[] args) {
        Stack arrayDeque = new ArrayDeque();
        arrayDeque.push("Hello 1");
        arrayDeque.push("Hello 2");
        arrayDeque.push("Hello 3");
        arrayDeque.push("Hello 4");
        arrayDeque.push("Hello 5");

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
//        System.out.println(arrayDeque.pop());

        System.out.println(arrayDeque);
    }

    @Override
    public boolean addFirst(Object object) {
        if (size == arrays.length) throw new IllegalStateException();
        if (head == 0) {
            head = arrays.length;
        }
        arrays[head - 1] = object;
        head--;
        size++;
        return true;
    }


    @Override
    public boolean addLast(Object object) {
        if (size == arrays.length) throw new IllegalStateException();
        if (arrays[this.tail] != null) return false;
        arrays[this.tail++] = object;
        size++;
        return true;
    }

    @Override
    public boolean offerFirst(Object object) {
        if (size == arrays.length) return false;
        if (head == 0) {
            head = arrays.length;
        }
        arrays[head - 1] = object;
        head--;
        size++;
        return true;
    }

    @Override
    public boolean offerLast(Object object) {
        if (size == arrays.length) return false;
        if (arrays[this.tail] != null) return false;
        arrays[this.tail++] = object;
        size++;
        return true;
    }

    @Override
    public Object removeFirst() {
        if (empty()){
            throw new NoSuchElementException();
        }
        Object oldElement = arrays[this.head];
        arrays[this.head] = null;
        if (this.head == arrays.length){
            head = 0;
        } else {
            head++;
        }
        size--;
        return oldElement;
    }

    @Override
    public Object removeLast() {
        if (empty()){
            throw new NoSuchElementException();
        }
        if (this.tail == 0){
            this.tail = arrays.length;
        }
        Object lastElementDeleted = arrays[this.tail - 1];
        arrays[this.tail - 1] = null;
            tail--;

        size--;
        return lastElementDeleted;
    }

    @Override
    public Object pollFirst() {
        if (empty()) return false;
        Object oldElement = arrays[this.head];
        arrays[this.head] = null;
        if (this.head == arrays.length){
            head = 0;
        } else {
            head++;
        }
        return oldElement;
    }

    @Override
    public Object pollLast() {
        if (tail == 0) {
            tail = arrays.length;
        }
        Object removedLast = arrays[tail - 1];
        arrays[tail-- - 1] = null;
        size--;
        return removedLast;
    }

    @Override
    public Object elementFirst() {
        if (empty()) throw new NoSuchElementException();
        return arrays[head];
    }

    @Override
    public Object elementLast() {
        if (empty()) throw new NoSuchElementException();
        return arrays[tail -1];
    }

    @Override
    public Object peekFirst() {
        if (empty()) return null;
        return arrays[head];
    }

    @Override
    public Object peekLast() {
        if (empty()) return null;
        return arrays[tail - 1];
    }

    @Override
    public boolean add(Object object) {
        return addLast(object);
    }

    @Override
    public boolean offer(Object object) {
        return offerFirst(object);
    }

    @Override
    public Object remove() {
        return removeFirst();
    }

    @Override
    public Object poll() {
        return pollFirst();
    }

    @Override
    public Object element() {
        return elementFirst();
    }

    @Override
    public Object push(Object object) {
        return addFirst(object);
    }

    @Override
    public Object pop() {
        return removeFirst();
    }

    @Override
    public Object peek() {
        return peekFirst();
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public int search(Object object) {
        for (int i = 0; i < arrays.length ; i++) {
            if (arrays[i].equals(object)){
                return i + 1;
            }
        }
        return -1;
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
