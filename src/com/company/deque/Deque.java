package com.company.deque;

import com.company.queue.Queue;
import com.company.stack.Stack;

public interface Deque extends Queue, Stack {
    boolean addFirst(Object object);

    boolean addLast(Object object);

    boolean offerFirst(Object object);

    boolean offerLast(Object object);

    Object removeFirst();

    Object removeLast();

    Object pollFirst();

    Object pollLast();

    Object elementFirst();

    Object elementLast();

    Object peekFirst();

    Object peekLast();

}
