package lists;

import sort.Comparator;
import data.Student;

public class SinglyLinkedList<T> implements Listable<T> {

    public Node head = null;
    public int counter = 0;

    private class Node {
        T data;
        Node next;
    }

    
    public void add(T data){
        Node newNode = new Node();
        newNode.data = data;

        if(head == null){
            head = newNode;
        } else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }

            last.next = newNode;
        }
    }

    
    public void add(int index, T data){
        if(index<0){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(data);
        }

        else {
            Node node = new Node();

            node.data = data;

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;

            }

            node.next = temp.next;
            temp.next = node;
        }
        counter++;
    }
    
    public void addFirst(T data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    
    public void addLast(T data){
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

    public void remove(int index){
        if (head == null){
            return;
        }

        Node temp = head;

        if (index == 0){
            head = temp.next;
            return;
        }

        for(int i = 0; temp != null && i<index-1; i++){
            temp = temp.next;
        }

        if (temp == null || temp.next == null){
            return;
        }

        Node next = temp.next.next;

        temp.next = next;
    }

    public void clear(){
        this.head = null;
    }

    @Override
	public int size(){
		if(head == null){
			return 0;
		}

		int counter = 0;

        Node tmp = head;
        while(tmp != null){
            counter++;
            tmp = tmp.next;
        }

        return counter;
	}

    public void printAll(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean isEmpty(){
        if (this.head == null){
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