package co.lugutori.samples.linkedlist;

public class Node<T> {
    private T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
    public void setNext(Node<T> node){
 
    }
}
