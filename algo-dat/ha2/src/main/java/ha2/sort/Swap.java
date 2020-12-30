package sort;

import ha2.lists.Listable;

public class Swap<T> {
    protected void swap(Listable<T> list, int i, int j){
        T memorizedObject = list.get(i);
		list.set(i, list.get(j));
		list.set(j, memorizedObject);
    }
}