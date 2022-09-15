package co.lugutori.samples.doublelinkedlist;

/**
 * @author Luis Guillermo Torres R.
 * 
 * Clase Lista doblemente enlazada circular
 */
public class MyDoubleLinkedList<T> {
    private Node<T> head;
    private int size = 0;
    private final int NOT_FOUND = -1;

    /**
    * Constructor, inicia la cabeza en null;
    */
    public MyDoubleLinkedList() {
        head = null;
    }
    
    /**
     * Agrega un elemento al final de la lista, aumenta el tamano en 1
     * @param data el dato a agregar
     * 
     * Complejidad: O(n) - Se debe recorrer toda la lista para agregar el elemento
     */
    public void add(T value) {
        size++;
        Node<T> newNode = new Node<>(value);
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
        head.previous = newNode;
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
        Node<T> window = head;
        for (int i = 0; i < position; i++) {
            window = window.next;
        }
        remove(window);
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
     * Metodo que atraviesa la lista al derecho y al reves
     * @return la representacion en String de la lista recorrida al derecho y al reves
     */
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
        Node<T> nextNode = node.next;
        if (nextNode != null) {
            nextNode.previous = newNode;
        }
        newNode.next = nextNode;
        newNode.previous = node;
        node.next = newNode;
    }
    /**
     * Metodo de ayuda a eliminar teniendo un nodo, disminuye el tamano en 1
     * @param node el nodo al cual se le agregara un nuevo nodo
     * 
     * Complejidad: O(1) - Eliminar el nodo
     */
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
