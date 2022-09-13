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

    }
}
