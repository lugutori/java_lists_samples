package co.lugutori.samples;

import co.lugutori.samples.arraylist.MyIntList;
import co.lugutori.samples.linkedlist.MyLinkedList;

class Main {
    public static void main(String[] args){
        System.out.println("Hello Lists World");

        MyIntList intList = new MyIntList();
        intList.add(4);
        intList.add(2);
        intList.add(5);
        intList.add(1);
        intList.add(9);

        intList.add(4);
        intList.add(2);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());

        intList.removePos(5);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(7);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(2);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(0);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());

        intList.add(0,10);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(1,10);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(2,10);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(3,10);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(4,10);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(5,10);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(6,10);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(7,10);
        System.out.println("linkedlist: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());

        //------------

        MyLinkedList<String> stringList = new MyLinkedList<>();

        stringList.add("Uno");
        stringList.add("Dos");
        stringList.add("Tres");
        stringList.add("Cuatro");

        System.out.println(stringList);

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(9);

        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(9);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());

        list.removePos(5);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.removePos(7);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.removePos(2);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.removePos(0);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.add(0,10);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.add(1,10);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.add(2,10);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.add(3,10);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.add(4,10);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.add(5,10);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.add(6,10);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());
        list.add(7,10);
        System.out.println("doublelinkedlist: " + list + " size: " + list.getSize());

        System.out.println();
    }
}
