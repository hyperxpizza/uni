package sort;

import ha2.lists.Listable;

public interface Sortable<T> {
    void sort(Listable<T> list, Comparator<T> comparator);
}