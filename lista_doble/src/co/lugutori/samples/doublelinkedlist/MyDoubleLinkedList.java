package co.lugutori.samples.doublelinkedlist;

public class MyDoubleLinkedList<T> {
    private Node<T> head;
    private int size = 0;
    private final int NOT_FOUND = -1;

    public MyDoubleLinkedList() {
        head = null;
    }

    public void add(T value) {
        size++;
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
    }

    public void insert(T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        if (null == head) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }


    public void add(int pos, T value) {
        if (pos > size || pos < 0) {
            //Throw exception
            return;
        }
        if(pos == 0){
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
        int count = 0;
        Node<T> window = head;
        while (window != null && result == NOT_FOUND) {
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

    public String traverse() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> window = head;
        Node<T> last = null;
        while (null != window) {
            builder.append(window.getData().toString());
            if (null != window.next) {
                builder.append(",");
            }
            last = window;
            window = window.next;
        }
        builder.append("]\nReverse: \n[");
        while (null != last) {
            builder.append(last.getData().toString());
            if (null != last.previous) {
                builder.append(",");
            }
            last = last.previous;
        }
        builder.append("]");
        return builder.toString();
    }

    private void add(Node<T> node, T value) {
        size++;
        Node<T> newNode = new Node<T>(value);
        Node<T> nextNode = node.next;
        if (nextNode != null) {
            nextNode.previous = newNode;
        }
        newNode.next = nextNode;
        newNode.previous = node;
        node.next = newNode;
    }

    private void remove(Node<T> node) {
        size--;
        Node<T> nextNode = node.next;
        Node<T> prevNode = node.previous;
        if (nextNode != null) {
            nextNode.previous = prevNode;
        }
        if (prevNode != null) {
            prevNode.next = nextNode;
        } else {
            head = nextNode;
        }
        node.next = null;
        node.previous = null;
    }
}
