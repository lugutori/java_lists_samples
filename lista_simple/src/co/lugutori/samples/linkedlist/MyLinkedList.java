package co.lugutori.samples.linkedlist;

/**
 * @author Luis Guillermo Torres R.
 * 
 * Clase Lista enlazada
 */
public class MyLinkedList<T> {
    private Node<T> head;
    private int size = 0;
    private final int NOT_FOUND = -1;

    /**
     * Constructor, inicia la cabeza en null;
     */
    public MyLinkedList() {
        head = null;
    }
    /**
     * Agrega un elemento al final de la lista, aumenta el tamano en 1
     * @param data el dato a agregar
     * 
     * Complejidad: O(n) - Se debe recorrer toda la lista para agregar el elemento
     */
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

    /**
     * Agrega un elemento al inicio de la lista, incrementa en 1 el tamano
     * @param value el valor a insertar
     * 
     * Complejidad: O(1) - cambio de variables
     */
    public void insert(T value) {
        size++;
        Node<T> newNode = new Node<>(value);
        if (null == head) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    /**
     * Agrega en una posicion especifica, no reemplaza el elemento sino que lo desplaza a la siguiente posicion
     * @param pos posicion en la que se desea el valor
     * @param value valor a agregar
     * 
     * Complejidad: O(n) - Se debe recorrer la lista hasta encontrar la posicion
     */
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

    /**
     * Eliminar el elemento en una posicion
     * @param position la posicion a eliminar
     * 
     * Complejidad: O(n) - Se debe recorrer la lista para encontrar el elemento
     */
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

    /**
     * Eliminar un elemento por su valor. Elimina el primero que encuentra, si lo encuentra
     * @param value El valor a eliminar
     * 
     * Complejidad O(n) - Busqueda + eliminacion
     */
    public void removeValue(T value) {
        int position = findValue(value);
        if (position != NOT_FOUND) {
            removePos(position);
        }
    }

    /**
     * Busca un elemento y retorna la posicion en donde lo encuentra
     * @param value el valor a buscar
     * @return la posicion del valor, -1 si no lo encuentra
     * 
     * Complejidad O(n) - Se debe recorrer la lista
     */
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

    /**
     * Obtiene el tamano de la lista
     * @return el tamano de la lista
     * 
     * Complejidad: O(1) - retornar el elemento size
     */
    public int getSize() {
        return size;
    }

    /**
     * INCOMPLETO: 
     * 
     * Obtiene el valor en la posicion dada
     * @param pos posicion de la cual se requiere el valor
     * @return el elemento en la posicion de la lista
     * 
     * Complejidad: O(???) 
     */
    public T get(int pos) {
        return null;
    }

    /**
     * Metodo toString
     */
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

    /**
     * Metodo de ayuda a agregar teniendo un nodo, incrementa el tamano en 1
     * @param node el nodo al cual se le agregara un nuevo nodo
     * @param value el valor que tendra el nuevo nodo
     * 
     * Complejidad: O(1) - Agregar nuevo nodo
     */
    private void add(Node<T> node, T value) {
        size++;
        Node<T> newNode = new Node<>(value);
        newNode.next = node.next;
        node.next = newNode;
    }
}
