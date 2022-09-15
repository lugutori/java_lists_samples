package co.lugutori.samples.arraylist;

import java.util.Arrays;

/**
 * @author Luis Guillermo Torres R.
 * 
 * Clase Lista enlazada con arreglos y templates
 */
public class MyArrayList<T> {
    private T[] listArray;
    private int size = 0;
    private int capacity;
    private final int INITIAL_CAPACITY = 10;
    private final int NOT_FOUND = -1;

    /**
     * Constructor por defecto
     */
    public MyArrayList() {
    }

    /**
     * Constructor con capacidad initial
     * @param initialCapacity capcidad inicial
     */
    public MyArrayList(int initialCapacity) {
        initListWithCapacity(initialCapacity);
    }
    
    /**
     * Agregar valor al arreglo
     * @param value valor a agregar
     * 
     * Complejidad: O(n) Al llenarse la lista debe crearse una copia
     */
    public void add(T value) {
        if (null == listArray) {
            initListWithCapacity(INITIAL_CAPACITY);
        }
        if (size == capacity) {
            increaseCapacity();
        }
        listArray[size] = value;
        size++;
    }

    /**
     * Agregar un valor en la posicion establecida
     * @param pos la posicion para agregar el valor
     * @param value el valor que se desea agregar
     * 
     * Compjelidad: O(n) - La lista debe crecer si se agrega un valor y se llena la lista
     */
    public void add(int pos, T value) {
        if (null == listArray) {
            initListWithCapacity(INITIAL_CAPACITY);
        }
        if (pos > size) {
            //Throw exception
            return;
        }
        if (pos == size) {
            add(value);
            return;
        }
        if (size == capacity) {
            increaseCapacity();
        }
        System.arraycopy(listArray, pos, listArray, pos+1, size - pos);
        listArray[pos] = value;
        size++;
    }
    /**
     * Eliminar un elemento de la lista en la posicion dada
     * @param position posicion para eliminar
     * 
     * Complejidad: O(n) - Se debe copiar el resto del arreglo
     */
    public void removePos(int position) {
        if (position >= size) {
            return;
        }
        size--;
        if (size - position > 0) {
            System.arraycopy(listArray, position + 1, listArray, position, size - position);
        }
        listArray[size] = null;
    }

    /**
     * Eliminar un valor dentro del arreglo, si se encuentra
     * @param value el valor a eliminar
     * 
     * Complejidad: O(n) - Busqueda + Eliminacion
     */
    public void removeValue(int value) {
        int position = findValue(value);
        if (position != NOT_FOUND) {
            removePos(position);
        }
    }

    /**
     * Encontrar un valor dentro del arreglo
     * @param value valor a encontrar
     * @return la posicion del valor o -1 si no se encuentra
     * 
     * Complejidad: O(n) - Se debe recorrer el arreglo para encontrarlo
     */
    public int findValue(int value) {
        int result = NOT_FOUND;
        for (int pos = 0; pos < size && result == NOT_FOUND; pos++) {
            if (listArray[pos].equals(value)) {
                result = pos;
            }
        }
        return result;
    }

    /**
     * Obtiene el tamano de la lista
     * @return el tamano de la lista
     * 
     * Complejidad: O(1) - Retorna variable size
     */
    public int getSize() {
        return size;
    }

    /**
     * NO ESTANDAR - SOLO CON PROPOSITOS ILUSTRATIVOS
     * 
     * Retorna la capacidad del arreglo
     * @return capacidad del arreglo
     */
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(listArray, 0, size));
    }
    
    /**
     * INCOMPLETO
     * 
     * Obtiene el elemento en la posicion deseada
     * @param pos la posicion deseada
     * @return el elemento en la posicion
     * 
     * Complejidad: O(???)
     */
    public T get(int pos) {
        return null;
    }

    /**
     * Inicializar lista con capacidad indicada
     * @param initialCapacity Capacidad inicial
     */
    private void initListWithCapacity(int initialCapacity) {
        this.capacity = initialCapacity;
        listArray = (T[]) new Object[initialCapacity];
    }
    
    /**
     * incrementa la capacidad
     * 
     * Complejidad O(n) - debe copiar todos los elementos de arreglo
     */
    private void increaseCapacity() {
        final float INCREASE_FACTOR = 2.0f;
        capacity = Float.valueOf(capacity * INCREASE_FACTOR).intValue();
        T[] newArray = (T[]) new Object[capacity];
        if (size >= 0) {
            System.arraycopy(listArray, 0, newArray, 0, size);
        }
        listArray = newArray;
    }
}
