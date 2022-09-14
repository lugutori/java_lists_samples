package co.lugutori.samples.doublelinkedlist;

import com.sun.istack.internal.NotNull;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MyDoubleLinkedList<T> {
    public Node<T> head;
    private int size = 0;
    private final int NOT_FOUND = -1;

    public MyDoubleLinkedList() {
        head = null;
    }

    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        if (null == head) {
            head = newNode;
            return;
        }
        Node<T> window = head;
        while (window.next != null) {
            window = window.next;
        }
        window.next = newNode;
        newNode.previous = window;
        size ++;
    }

    public void insert(T value) {
        Node<T> newNode = new Node<T>(value);
        if (null == head) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
        size ++;
    }


    public void add(int pos, T value) {
        if (pos > size) {
            //Throw exception
            return;
        }
        Node<T> window = head;
        for(int i = 0; i < pos; i++){
            window = window.next;
        }
        add(window,value);
        size++;
    }

    public void removePos(int position) {
        if (position > size) {
            //Throw exception
            return;
        }
        Node<T> window = head;
        for(int i = 0; i < position; i++){
            window = window.next;
        }
        remove(window);
        size++;
    }

    public void removeValue(T value) {
        int position = findValue(value);
        if (position != NOT_FOUND) {
            removePos(position);
        }
        size--;
    }

    public int findValue(T value) {
        int result = NOT_FOUND;
        int count = 0;
        Node<T> window = head;
        while(window != null && result == NOT_FOUND){
            if(window.getData().equals(value)){
                result = count;
            }
            window = window.next;
            count++;
        }
        return result;
    }

    public int getSize(){
        return size;
    }

    public T get(int pos){
        throw new NotImplementedException();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> window = head;
        while (null != window) {
            builder.append(window.getData().toString());
            if (null != window.next) {
                builder.append(",");
            }
            window = window.next;
        }
        builder.append("]");
        return builder.toString();
    }

    private void add(@NotNull Node<T> node, T value) {
        Node<T> newNode = new Node<T>(value);
        Node<T> nextNode = node.next;
        if (nextNode != null) {
            nextNode.previous = newNode;
        }
        newNode.next = nextNode;
        newNode.previous = node;
        node.next = newNode;
    }

    private void remove(@NotNull Node<T> node) {
        Node<T> nextNode = node.next;
        Node<T> prevNode = node.previous;
        if (nextNode != null) {
            nextNode.previous = prevNode;
        }
        if (prevNode != null) {
            prevNode.next = nextNode;
        }
        node.next = null;
        node.previous = null;
    }
}
