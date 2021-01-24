package com.company.list;

import java.util.Arrays;

public class ArrayList implements List {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int size = 0;

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello 1");
        arrayList.add("Hello 2");
        arrayList.add("Hello 3");
        arrayList.add("Hello 4");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
        arrayList.add("Hello 5");
       /* Object set = arrayList.set(1, "Hello 6");
        System.out.println(set);*/
//        arrayList.add(2, "Hello 22");
//        arrayList.remove(4);
//        arrayList.remove("Hello 1");
//
        System.out.println(arrayList);
    }

    public ArrayList() {
    }

    public ArrayList(int initialCapacity) {
        this.array = new Object[initialCapacity];
    }

    public ArrayList(List list) {
    }

    private void grow(){
        int newCapacity = array.length + (array.length / 2);
        if (newCapacity < 0) throw new OutOfMemoryError();
        this.array = Arrays.copyOf(this.array, newCapacity);
    }

    @Override
    public void add(Object o) {
        if (size == array.length) grow();
        array[size++] = o;
    }

    @Override
    public void add(int index, Object o) {
        if (size == array.length) grow();
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index, array, index + 1, array.length - 1 - index);
        }
        array[index] = o;
        size++;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                for (int j = index; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                size--;
                break;
            }
        }
    }

    @Override
    public void remove(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                size--;
                break;
            }
        }
    }

    @Override
    public Object set(int index, Object o) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                Object a = array[i];
                array[i] = o;
                return a;
            }
        }
        return null;
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
        return Arrays.copyOf(array,size);
    }

    @Override
    public List subList(int from, int to) {
        List arrayList = new ArrayList();
        for (int i = from; i < to; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    // [Hello 1, Hello 2]

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
