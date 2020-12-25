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
}