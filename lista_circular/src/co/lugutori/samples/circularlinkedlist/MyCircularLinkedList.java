package co.lugutori.samples.circularlinkedlist;

import com.sun.istack.internal.NotNull;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MyCircularLinkedList<T> {
    private Node<T> head;
    private int size = 0;
    private final int NOT_FOUND = -1;

    public MyCircularLinkedList() {
        head = null;
    }

    public void add(T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        if (null == head) {
            head = newNode;
            newNode.next=head;
            return;
        }
        Node<T> window = head;
        while (window.next != head) {
            window = window.next;
        }
        window.next = newNode;
        newNode.next = head;
    }

    public void insert(T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        if (null == head) {
            head = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        Node<T> window = head;
        while(window.next != head){
            window = window.next;
        }
        window.next = newNode;
        head = newNode;
    }


    public void add(int pos, T value) {
        if (pos > size) {
            //Throw exception
            return;
        }
        if(pos == 0){
            insert(value);
            return;
        }
        Node<T> window = head;
        for (int i = 0; i < pos; i++) {
            window = window.next;
        }
        add(window, value);
    }

    public void removePos(int position) {
        if (position > size) {
            //Throw exception
            return;
        }
        size--;
        if(position == 0){
            Node<T> window = head;
            while(window.next != head){
                window = window.next;
            }
            window.next = head.next;
            head = head.next;
            return;
        }

        Node<T> window = head;
        for (int i = 0; i < position-1; i++) {
            window = window.next;
        }
        Node<T> nextNode = window.next;
        window.next = nextNode.next;
        nextNode.next = null;
    }

    public void removeValue(T value) {
        int position = findValue(value);
        if (position != NOT_FOUND) {
            removePos(position);
        }
    }

    public int findValue(T value) {
        int result = NOT_FOUND;
        int count = 0;
        Node<T> window = head;
        while (count < size && result == NOT_FOUND) {
            if (window.getData().equals(value)) {
                result = count;
            }
            window = window.next;
            count++;
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    public T get(int pos) {
        throw new NotImplementedException();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> window = head;
        do {
            builder.append(window.getData().toString());
            if (head != window.next) {
                builder.append(",");
            }
            window = window.next;
        } while (window != head);
        builder.append("]");
        return builder.toString();
    }

    public String taverseTimes(int times){
        int headCount = 0;
        Node<T> window = head;
        StringBuilder builder = new StringBuilder("[<"+window.getData()+">");
        while(headCount < times){
            builder.append(", ");
            window = window.next;
            if(window == head){
                headCount++;
                builder.append("<");
            }
            builder.append(window.getData());
            if(window == head){
                builder.append(">");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    private void add(@NotNull Node<T> node, T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        newNode.next = node.next;
        node.next = newNode;
    }

}
