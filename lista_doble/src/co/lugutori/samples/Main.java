package co.lugutori.samples;

import co.lugutori.samples.arraylist.MyList;
import co.lugutori.samples.linkedlist.MyLinkedList;

class Main {
    public static void main(String[] args){
        System.out.println("Hello Lists World");
        MyLinkedList<String> stringList = new MyLinkedList<>();

        stringList.addNode("Uno");
        stringList.addNode("Dos");
        stringList.addNode("Tres");
        stringList.addNode("Cuatro");

        System.out.println(stringList);

        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.addNode(1);
        intList.addNode(2);
        intList.addNode(3);
        intList.addNode(4);

        System.out.println(intList);
        //------------
        MyList<Integer> list = new MyList<>();
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
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());

        list.removePos(5);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.removePos(7);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.removePos(2);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.removePos(0);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());

        list.add(0,10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(1,10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(2,10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(3,10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(4,10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(5,10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(6,10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(7,10);
        System.out.println("linkedlist: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
    }
}
