package co.lugutori.samples;

import co.lugutori.samples.circularlinkedlist.MyCircularLinkedList;

class Main {
    public static void main(String[] args){
        MyCircularLinkedList<Integer> list = new MyCircularLinkedList<>();
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
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());

        list.removePos(5);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.removePos(7);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.removePos(2);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.removePos(0);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());

        list.add(0,10);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.add(1,10);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.add(2,10);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.add(3,10);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.add(4,10);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.add(5,10);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.add(6,10);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        list.add(7,10);
        System.out.println("circularlinkedlist: " + list + " size: " + list.getSize());
        System.out.println("Traversing:");
        System.out.println(list.taverseTimes(5));
    }
}
