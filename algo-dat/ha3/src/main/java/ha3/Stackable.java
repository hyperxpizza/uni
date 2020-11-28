package main.java.ha3;

public interface Stackable<T> {
	void push(T data);
	T peek();
	T pop();
	boolean isEmpty();
	int size();
	void print();
	void clear();
}
