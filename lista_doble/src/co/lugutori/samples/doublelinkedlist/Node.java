package co.lugutori.samples.doublelinkedlist;

public class Node<T> {
    private T data;
    Node<T> next;
    Node<T> previous;

    public Node(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public T getData(){
        return this.data;
    }
}
