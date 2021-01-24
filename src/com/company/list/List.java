package com.company.list;

public interface List {
    static List asList(Object[] o) {
        ArrayList arrayList = new ArrayList();
        for (Object o1 : o) {
            arrayList.add(o1);
        }
        return arrayList;
    }

    void add(Object o);

    void add(int index, Object o);

    Object get(int index);

    void remove(int index);

    void remove(Object o);

    Object set(int index, Object o);

    int size();

    boolean isEmpty();

    Object[] toArray();

    List subList(int from, int to);
}
