package com.company;

import com.company.list.DeqLinkedList;
import com.company.list.List;
import com.company.list.Person;
import com.company.stack.LinkedStack;
import com.company.stack.Stack;

public class Main {

    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person("Peter", 23);
        persons[1] = new Person("Vasya", 26);
        persons[2] = new Person("Kolyar", 31);


        LinkedStack linkedStack = new LinkedStack();

        linkedStack.linkedStackCopyOfMassive(persons);

        System.out.println(linkedStack);
    }
}
