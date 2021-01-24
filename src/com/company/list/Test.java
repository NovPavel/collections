package com.company.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> items = new LinkedList<>();

        items.add(78);
        items.add(65468);
        items.add(454);
        items.add(1332);
        items.add(4654);


        Iterator<Integer> iterator = items.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

        System.out.println(items);


    }

}
