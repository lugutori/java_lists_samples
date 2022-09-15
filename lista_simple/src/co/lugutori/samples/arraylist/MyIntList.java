package co.lugutori.samples.arraylist;

import java.util.Arrays;

public class MyIntList {
    private int[] listArray;
    private int size = 0;
    private int capacity;
    private final int INITIAL_CAPACITY = 10;
    private final int NOT_FOUND = -1;

    public MyIntList() {
    }

    public MyIntList(int initialCapacity) {
        initListWithCapacity(initialCapacity);
    }

    public void add(int value) {
        if (null == listArray) {
            initListWithCapacity(INITIAL_CAPACITY);
        }
        if (size == capacity) {
            increaseCapacity();
        }
        listArray[size] = value;
        size++;
    }

    public void add(int pos, int value) {
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

    public void removePos(int position) {
        if (position >= size) {
            return;
        }
        size--;
        if (size - position > 0) {
            System.arraycopy(listArray, position + 1, listArray, position, size - position);
        }
        listArray[size] = 0;
    }

    public void removeValue(int value) {
        int position = findValue(value);
        if (position != NOT_FOUND) {
            removePos(position);
        }
    }

    public int findValue(int value) {
        int result = NOT_FOUND;
        for (int pos = 0; pos < size && result == NOT_FOUND; pos++) {
            if (listArray[pos] == value) {
                result = pos;
            }
        }
        return result;
    }

    public int get(int pos) {
        return 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "[]";
        }
        return Arrays.toString(Arrays.copyOfRange(listArray, 0, size));
    }

    private void initListWithCapacity(int initialCapacity) {
        this.capacity = initialCapacity;
        listArray = new int[initialCapacity];
    }

    private void increaseCapacity() {
        final float INCREASE_FACTOR = 2.0f;
        capacity = Float.valueOf(capacity * INCREASE_FACTOR).intValue();
        final int[] newArray = new int[capacity];
        if (size >= 0) {
            System.arraycopy(listArray, 0, newArray, 0, size);
        }
        listArray = newArray;
    }
}
