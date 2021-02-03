package com.company.stack;

public interface Stack {
    Object push(Object object);

    Object pop();

    Object peek();

    boolean empty();

    int search(Object object);
}
