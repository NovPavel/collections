package com.company.queue;

public interface Queue {
    boolean add(Object object);

    boolean offer(Object object);

    Object remove();

    Object poll();

    Object element();

    Object peek();
}
