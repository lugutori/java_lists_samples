package co.lugutori.samples.doublecircularlinkedlist;

public class MyDoubleCircularLinkedList<T> {
    private Node<T> head;
    private int size = 0;
    private final int NOT_FOUND = -1;

    public MyDoubleCircularLinkedList() {
        head = null;
    }

    public void add(T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        if (null == head) {
            initList(newNode);
            return;
        }
        Node<T> window = head;
        while (window.next != head) {
            window = window.next;
        }
        head.previous = newNode;
        newNode.next = head;
        newNode.previous = window;
        window.next = newNode;
    }

    private void initList(Node<T> newNode) {
        head = newNode;
        newNode.previous = head;
        newNode.next = head;
    }

    public void insert(T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        Node<T> lastNode = head.previous;
        newNode.previous = lastNode;
        newNode.next = head;

        head.previous = newNode;
        lastNode.next = newNode;

        head = newNode;
    }


    public void add(int pos, T value) {
        if (pos > size || pos < 0) {
            //Throw exception
            return;
        }
        if (pos == 0) {
            insert(value);
            return;
        }
        Node<T> window = head;
        for (int i = 1; i < pos; i++) {
            window = window.next;
        }
        add(window, value);
    }

    public void removePos(int position) {
        if (position > size || position < 0) {
            //Throw exception
            return;
        }
        Node<T> window = head;
        for (int i = 0; i < position; i++) {
            window = window.next;
        }
        remove(window);
    }

    public void removeValue(T value) {
        int position = findValue(value);
        if (position != NOT_FOUND) {
            removePos(position);
        }
    }

    public int findValue(T value) {
        int result = NOT_FOUND;
        Node<T> window = head;
        for (int pos = 0; pos < size && result == NOT_FOUND; pos++) {
            if (window.getData().equals(value)) {
                result = pos;
            }
            window = window.next;
        }
        return result;
    }

    public int getSize() {
        return size;
    }

    public T get(int pos) {
        return null;
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

    public String traverse() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> window = head;
        do {
            builder.append(window.getData().toString());
            if (head != window.next) {
                builder.append(",");
            }
            window = window.next;
        } while (window != head);
        builder.append("]\nReverse: \n[");
        window = head.previous;
        do {
            builder.append(window.getData().toString());
            if (window != head) {
                builder.append(",");
            }
            window = window.previous;
        } while (window != head.previous);
        builder.append("]");
        return builder.toString();
    }

    public String traverseTimes(int times){
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

    private void add(Node<T> node, T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        Node<T> nextNode = node.next;
        newNode.next = nextNode;
        newNode.previous = node;
        nextNode.previous = newNode;
        node.next = newNode;
    }

    private void remove(Node<T> node) {
        size--;
        Node<T> nextNode = node.next;
        Node<T> prevNode = node.previous;
        nextNode.previous = prevNode;
        prevNode.next=nextNode;
        if(node == head){
            head = nextNode;
        }
        node.next = null;
        node.previous = null;
    }
}
