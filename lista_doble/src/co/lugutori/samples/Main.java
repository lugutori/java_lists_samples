package co.lugutori.samples;

import co.lugutori.samples.doublelinkedlist.MyDoubleLinkedList;

class Main {
    public static void main(String[] args){
        System.out.println("Hello Lists World");
        MyDoubleLinkedList<String> stringList = new MyDoubleLinkedList<>();

        stringList.add("Uno");
        stringList.add("Dos");
        stringList.add("Tres");
        stringList.add("Cuatro");

        System.out.println(stringList);

        MyDoubleLinkedList<Integer> intList = new MyDoubleLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        System.out.println(intList);
        //------------
        MyDoubleLinkedList<Integer> list = new MyDoubleLinkedList<>();
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
        System.out.println(list.traverse());
    }
}
