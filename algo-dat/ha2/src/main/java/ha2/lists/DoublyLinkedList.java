package lists;

public class DoublyLinkedList<T> implements Listable<T> {

	private Node head = null;
	private Node tail = null;
	
	private class Node {
		T data = null;
		Node next = null;
		Node prev = null;
	}
	
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAt(int index, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		// counter = 0;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return ((head == null) && (tail == null));
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}