package co.lugutori.samples;

import co.lugutori.samples.arraylist.MyIntList;
import co.lugutori.samples.linkedlist.MyLinkedList;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello Lists World");

        MyIntList intList = new MyIntList();
        System.out.println("Empty list:");
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        System.out.println("Testing Adding on Array List");
        intList.add(4);
        intList.add(2);
        intList.add(5);
        intList.add(1);
        intList.add(9);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        System.out.println("Testing Removing on Array List");
        intList.removePos(5);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(7);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(4);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(3);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(2);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(1);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.removePos(0);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());

        System.out.println("Testing Adding w/position on Array List");
        intList.add(0, 100);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(1, 200);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(2, 300);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(3, 400);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(4, 500);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(5, 600);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(6, 700);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(7, 800);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(8, 900);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(9, 1000);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(10, 1100);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(11, 1200);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        intList.add(12, 1300);
        System.out.println("arrayList: " + intList + " size: " + intList.getSize() + " capacity: " + intList.getCapacity());
        System.out.println("Testing Finding on LinkedList");
        int pos1 = intList.findValue(50);
        int pos2 = intList.findValue(1000);
        System.out.printf("Elements found in position %d and %d", pos1, pos2);
        System.out.println();

        //------------

        MyLinkedList<String> stringList = new MyLinkedList<>();

        System.out.println("Empty list:");
        System.out.println("linkedList: " + stringList + " size: " + stringList.getSize());
        System.out.println("Testing Adding on Linked List");

        stringList.add("Uno");
        stringList.add("Dos");
        stringList.add("Tres");
        stringList.add("Cuatro");

        System.out.println(stringList);

        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println("Empty list:");
        System.out.println("linkedList: " + list + " size: " + list.getSize());
        System.out.println("Testing Adding on Linked List");
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(9);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());

        System.out.println("Testing removing on Linked List");
        list.removePos(4);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.removePos(3);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.removePos(2);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.removePos(1);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.removePos(0);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        System.out.println("Testing Adding w/position on Linked List");
        list.add(0, 10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.add(1, 20);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.add(2, 30);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.add(3, 40);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.add(4, 50);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.add(5, 60);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.add(6, 70);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        list.add(7, 80);
        System.out.println("linkedlist: " + list + " size: " + list.getSize());
        System.out.println("Testing Finding on Linked List");
        pos1 = list.findValue(50);
        pos2 = list.findValue(1000);
        System.out.printf("Elements found in position %d and %d", pos1, pos2);
        System.out.println();
    }
}
