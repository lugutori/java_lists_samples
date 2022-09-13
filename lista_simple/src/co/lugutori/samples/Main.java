package co.lugutori.samples;

import co.lugutori.samples.list.List;

class Main {
    public static void main(String[] args){
        System.out.println("Hello Lists World");
        List<String> stringList = new List<String>();

        stringList.addNode("Uno");
        stringList.addNode("Dos");
        stringList.addNode("Tres");
        stringList.addNode("Cuatro");

        System.out.println(stringList);
    }
}
