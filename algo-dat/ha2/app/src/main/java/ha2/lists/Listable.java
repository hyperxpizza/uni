package lists;
import java.util.List;

import sort.Comparator;

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
    List<T> search(Comparator comparator, T data);
}