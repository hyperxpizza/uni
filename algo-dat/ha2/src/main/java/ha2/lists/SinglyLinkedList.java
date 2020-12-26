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

    @Override
    public void add(T data){

    }

    @Override
    public add(int index, T data){

    }

    @Override
    public void addFirst(T data){

    }

    @Override
    public void addLast(T data){
        Node node = new Node(data, null); 

        if (this.head == null){
            this.head = node;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }

    @Override
    public boolean isEmpty(){
        if (this.head == null){
            return true;
        }

        return false;
    }

    @Override
    public void clear(){
        this.head = null;
    }

    @Override
    public void printAll(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public T get(int index){
        if((head == null) || (index < 0) || (index >= size())){
            return null;
        }

        Node temp = head;
        for (int i = 0; i < index; i ++){
            temp = temp.next;
        }

        return temp.data;
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

}