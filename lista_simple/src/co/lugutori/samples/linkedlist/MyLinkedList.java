package co.lugutori.samples.linkedlist;


public class MyLinkedList<T> {
    private Node<T> head;
    private int size = 0;
    private final int NOT_FOUND = -1;

    public MyLinkedList() {
        head = null;
    }

    public void add(T data) {
        size++;
        Node<T> newNode = new Node<T>(data);
        if (null == head) {
            head = newNode;
            return;
        }
        Node<T> window = head;
        while (window.next != null) {
            window = window.next;
        }
        window.next = newNode;
    }

    public void insert(T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        if (null == head) {
            head = newNode;
            return;
        }
        newNode.next = head;
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
        size--;
        if (position == 0) {
            head = head.next;
            return;
        }

        Node<T> window = head;
        for (int i = 1; i < position; i++) {
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

    private void add(Node<T> node, T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        newNode.next = node.next;
        node.next = newNode;
    }

}
