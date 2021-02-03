package com.company.queue;

import java.util.NoSuchElementException;

public class ArrayQueue implements Queue {
    int size = 0;
    Object[] objects = new Object[10];

    @Override
    public boolean add(Object object) {
        if (objects.length == size) {
            throw new IllegalStateException();
        } else {
            objects[size++] = object;
        }
        return true;
    }

    @Override
    public boolean offer(Object object) {
        if (objects.length == size) {
            return false;
        }
        objects[size++] = object;
        return true;
    }

    @Override
    public Object remove() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {
            Object old = objects[0];
            for (int i = 0; i < objects.length; i++) {
                objects[i] = objects[i + 1];
            }
            size--;
            return old;
        }
    }

    @Override
    public Object poll() {
        if (size == 0) {
            return null;
        } else {
            Object old = objects[0];
            for (int i = 0; i < objects.length; i++) {
                objects[i] = objects[i + 1];
            }
            size--;
            return old;
        }
    }

    @Override
    public Object element() {
        if (size == 0) {
            throw new NoSuchElementException();
        } else {

            return objects[0];
        }
    }

    @Override
    public Object peek() {
        if (size > 0){
            return objects[0];
        }
        return null;
    }
}
