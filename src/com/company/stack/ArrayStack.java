package com.company.stack;

import java.util.Arrays;

public class ArrayStack implements Stack {

    private Object[] stacks = new Object[10];
    private int size = 0;

    public ArrayStack() {
    }

    public ArrayStack(Stack stack) {
    }

    public static void main(String[] args) {
        Stack arrayStack = new ArrayStack();
        arrayStack.push("Hello 1");
        arrayStack.push("Hello 2");
        arrayStack.push("Hello 3");
        arrayStack.push("Hello 4");
        arrayStack.push("Hello 5");

        Stack stack = new ArrayStack(arrayStack);

        System.out.println(arrayStack);

        System.out.println(arrayStack.search("Hello 2"));

//        System.out.println(arrayStack.peek());
//        System.out.println(arrayStack.peek());
//        System.out.println(arrayStack.pop());
//        System.out.println(arrayStack.peek());

//        System.out.println(arrayStack.pop());
//        System.out.println(arrayStack.pop());
//        System.out.println(arrayStack.pop());

//        System.out.println(arrayStack);
    }

    @Override
    public Object push(Object object) {
        return stacks[size++] = object;
    }

    @Override
    public Object pop() {
        Object stack = stacks[size - 1];
        stacks[size - 1] = null;
        size--;
        return stack;
    }

    @Override
    public Object peek() {
        if (empty()) throw new NullPointerException();
        else {
            return stacks[size - 1];
        }
    }

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public int search(Object object) {
        for (int i = size - 1, j = 0; i >= 0; i--, j++) {
            if (stacks[i].equals(object)){
                return j;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "stacks=" + Arrays.toString(stacks) +
                ", size=" + size +
                '}';
    }
}
