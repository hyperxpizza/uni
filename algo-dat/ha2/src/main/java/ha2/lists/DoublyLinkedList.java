package lists;

import sort.Comparator;
import data.Student;

public class DoublyLinkedList<T> implements Listable<T> {

	private Node head = null;
	private Node tail = null;
	public int counter = 0;
	
	private class Node {
		T data = null;
		Node next = null;
		Node prev = null;
	}
	
	@Override
	public void add(T data) {
		Node newNode = new Node();
		newNode.data = data;
		
		Node last = head;
		newNode.next = null;

		if(head == null) {
			newNode.prev = null;
			head = newNode;
			counter++;
			return;
		}

		while(last.next != null){
			last = last.next;
		}

		last.next = newNode;
		newNode.prev = last;

		counter++;
		
	}

	@Override
	public void add(int index, T data){
		if(index > size() || index < 0){
			throw new IndexOutOfBoundsException();
		}

		Node newNode = new Node();
		newNode.data = data;

		if (head == null){
			head = tail = newNode;
		} else if(index == 0){
			newNode.next = head;
			newNode.prev = null;
			head = newNode;
		} else if (index == size()){
			newNode.prev = tail;
			newNode.next = null;
			tail = newNode;
		} else {
			Node tmp = head;
			for(int i = 1; i < index; i++){
				tmp = tmp.next;
			}

			newNode.next = tmp.next;
			tmp.next = newNode;
			newNode.prev = tmp;
			newNode.next.prev = newNode;
		}

		counter++;
	}

	@Override
	public void addFirst(T data){
		add(0, data);
	}
	
	@Override
	public void addLast(T data) {
		add(size(), data);
		
	}

	@Override
    public void set(int index, T data) {

    	if (index > size()) {
            throw new IllegalArgumentException();
        }
        if (index < 0) {
            throw new NullPointerException();
        }
        if (index <= size()) {
            int counter = 0;
            Node tmp = head;
            while (counter != index) {
                counter++;
                tmp = tmp.next;
            }
            tmp.data = data;

        }
    }
	
	@Override
	public T get(int index){
		if((head == null) || (index < 0) || (index >= size())){
            return null;
        }

        Node temp = head;
        int counter = 0;
        while(temp != null){
            if(counter == index){
                return temp.data;
            }
            counter++;
            temp = temp.next;
		}
		
		return null;
	}
	
	@Override
	public void remove(int index){
		if(head == null || index<0 || index > size()){
			throw new IndexOutOfBoundsException();
		}

		Node tmp = head;
		int i = 0;
		while(tmp != null){
			if(i == index){
				tmp.prev.next = tmp.next;
				tmp.next.prev = tmp.prev;
			}

			i++;
		}
		counter --;
	}

	@Override
	public int size(){
		return counter;
	}

	@Override
	public void clear(){
		head = null;
		tail = null;
		counter = 0;
	}

	@Override
	public void printAll(){
		Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
	}

	@Override
	public boolean isEmpty(){
		if(head == null && tail == null){
			return true;
		}

		return false;
	}

	public T search(Comparator comparator, T data){
		if(head == null){
			return null;
		}

		Node tmp = head;
		while(tmp != null){
			if(comparator.compare(tmp.data, data) == 0){
				return tmp.data;
			}
			tmp = tmp.next;
		}

		return null;
	}
}