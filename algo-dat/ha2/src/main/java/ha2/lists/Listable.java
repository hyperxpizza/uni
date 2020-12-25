package lists;

public interface Listable<T> {
    void add(T data);
    void add(int index, T data);
    void addFirst(T data);
    void addLast(T data);
    void set(int index, T data);
    T get(int index);
    void remove(int index);
    void clear();
    int size();
    void printAll();
    boolean isEmpty();
}