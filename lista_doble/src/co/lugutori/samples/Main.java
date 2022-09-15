package co.lugutori.samples;

import co.lugutori.samples.doublelinkedlist.MyDoubleLinkedList;

class Main {
    public static void main(String[] args){
        System.out.println("Hello Lists World");
        MyDoubleLinkedList<Integer> list = new MyDoubleLinkedList<>();
        System.out.println("Empty list:");
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        System.out.println("Testing Adding on Double Linked List");
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(9);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());

        System.out.println("Testing removing on Double Linked List");
        list.removePos(4);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.removePos(3);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.removePos(2);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.removePos(1);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.removePos(0);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        System.out.println("Testing Adding w/position on Double Linked List");
        list.add(0,10);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.add(1,20);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.add(2,30);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.add(3,40);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.add(4,50);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.add(5,60);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.add(6,70);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        list.add(7,80);
        System.out.println("doubleLinkedList: " + list + " size: " + list.getSize());
        System.out.println("Testing Finding on Double Linked List");
        final int pos1 = list.findValue(50);
        final int pos2 = list.findValue(1000);
        System.out.printf("Elements found in position %d and %d\n",pos1,pos2);
        System.out.println("Traversing:");
        System.out.println(list.traverse());
    }
}
