package lists;

public class SinglyLinkedList<T> implements Listable<T> {

    Node head = null;

    private class Node {
        T data;
        Node next;

        private Node(){
            this.data = null;
            this.next = null;
        }

        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    
    public void add(T data){
        Node newNode = new Node(data, null);

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
        if(index > size() || index < 0){
			throw new IndexOutOfBoundsException();
		}

        Node newNode = new Node();
        newNode.data = data;


        if(head == null){
            head = newNode;
        } else if(index == 0){
            newNode.next = head;
            head = newNode;
        } else if(index == size()){
            add(data);
        } else {
            Node tmp = head;
            for(int i = 1; i < index; i++){
                tmp = tmp.next;
            }

        }

    }
    
    public void addFirst(T data){
        add(0, data);
    }

    
    public void addLast(T data){
        add(size(), data);
    }

    @Override
    public void set(int index, T data){
        remove(index);
		add(index, data);
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

    public int size(){
        int counter = 0;
        Node tmp = head;
        while(tmp.next != null){
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

    /*
    public void bubbleSortByCourse() {
        /*
        if(size() > 1){
            for(int i = 0; i < size(); i++){
                Node curr = head;
                Node next = head.next;
                for(int j = 0; j< size() -1; j++){
                    if
                }
            }
        }
        
    }
    public T searchPrename(String prename){
        if(head == null){
            return null;
        }

        Node tmp = head;
        while(tmp.next != null){
            if(tmp.data.equals
        }
    }
    */
    
}