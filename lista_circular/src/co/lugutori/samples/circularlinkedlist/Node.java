package co.lugutori.samples.circularlinkedlist;

public class Node<T> {
    private T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public T getData(){
        return this.data;
    }

}
