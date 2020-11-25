
public class Liste {
    
    public int size() {
        Node n = this.first;
        int length = 0;
        while(n != null){
            length++;
            n = n.getNext();
        }

        return length;
    }

    public boolean isEmpty(){
        if (this.top == null){
            return true;
        }

        return false;
    }
}