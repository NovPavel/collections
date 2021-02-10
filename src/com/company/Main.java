package com.company;

import com.company.deque.ArrayDeque;
import com.company.deque.Deque;
import com.company.list.DeqLinkedList;
import com.company.list.List;
import com.company.list.Person;
import com.company.queue.ArrayQueue;
import com.company.queue.LinkedQueue;
import com.company.queue.Queue;
import com.company.stack.LinkedStack;
import com.company.stack.Stack;

public class Main {

    public static void main(String[] args) {

        /*Queue arrayQueue = new ArrayQueue();
        arrayQueue.add(new Person("Pavel", 23));
        arrayQueue.add(new Person("Peter", 25));
        arrayQueue.add(new Person("Vasya", 29));
        arrayQueue.add(new Person("Nikita", 33));*/
//        System.out.println(arrayQueue.peek());

//        arrayQueue.offer(new Person("Nikolay", 25));

//        System.out.println(arrayQueue);

//        arrayQueue.remove();

       // System.out.println(arrayQueue);

    /*Queue linkedQueue = new LinkedQueue();


    linkedQueue.add(new Person("Pavel", 21));
    linkedQueue.add(new Person("Petia", 56));
    linkedQueue.add(new Person("Roma", 34));
    linkedQueue.add(new Person("Dima", 44));

        System.out.println(linkedQueue);


        linkedQueue.remove();
        System.out.println(linkedQueue);

        System.out.println(linkedQueue.element());
*/


        Deque deque = new ArrayDeque();

        deque.addLast(new Person("Peter", 27));
        deque.addLast(new Person("Vasya", 31));

        System.out.println(deque);

    }
}
