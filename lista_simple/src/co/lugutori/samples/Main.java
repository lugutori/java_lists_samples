package co.lugutori.samples;

import co.lugutori.samples.list.List;

class Main {
    public static void main(String[] args){
        System.out.println("Hello Lists World");
        List<String> stringList = new List<>();

        stringList.addNode("Uno");
        stringList.addNode("Dos");
        stringList.addNode("Tres");
        stringList.addNode("Cuatro");

        System.out.println(stringList);

        List<Integer> intList = new List<>();
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
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());

        list.removePos(5);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.removePos(7);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.removePos(2);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.removePos(0);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());

        list.add(0,10);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(1,10);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(2,10);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(3,10);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(4,10);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(5,10);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(6,10);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
        list.add(7,10);
        System.out.println("list: " + list + " size: " + list.getSize() + " capacity: " + list.getCapacity());
    }
}
