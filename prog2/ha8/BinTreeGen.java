package ha8;

public class BinTreeGen<E extends Comparable<E>> implements BinTreeGenInterface<E>  {
    public BinNodeGen<E> root = null;
    static final int COUNT = 10; 
    
    public BinTreeGen(){
        root = null;
    }

    public BinTreeGen(BinNodeGen<E> root){
        this.root = root;
    }

    public int countNodes(){
        int count = countNodes(root);
        return count;
    }

    public int countNodes(BinNodeGen<E> k){
        int counter = 0;
        if(k != null){
            counter = 1 + countNodes(k.left) + countNodes(k.right);
        }

        return counter;
    }

    public String toString(){
        String msg = toString(root);
        return msg;
    }

    public String toString(BinNodeGen<E> k){
    	String msg = "";
    	if(k != null) {
    		msg = "(";
    		msg = msg + toString(k.left);
    		msg = msg + " " + k.data + " ";
    		msg = msg + toString(k.right);
    		msg = msg + ")";
    	}
    	
    	return msg;
    }

    public BinNodeGen<E> find(E item){
        BinNodeGen<E> node = find(root, item);
        return node;

    }

    public BinNodeGen<E> find(BinNodeGen<E> root, E item){
        if(root != null){
            if(root.data == item){
                return root;
            } else {
                if(item.compareTo(root.data) < 0){
                    return find(root.left, item);
                } else if(item.compareTo(root.data) > 0){
                    return find(root.right, item);
                }
            }
        } 

        return null;
    }

    public boolean insertNode(E item){
    		BinNodeGen<E> newNode = new BinNodeGen<E>(item);
    		if(root == null) {
    			System.out.println("root is null");
    		} else {
    			System.out.println("root is not null");
    		}
    		insertNode(root, newNode);
    		return true;
    }
    
    public void insertNode(BinNodeGen<E> root, BinNodeGen<E> newNode) {
    	if(root != null) {
    		if(newNode.data.compareTo(root.data) < 0) {
    			if(root.left == null) {
    				root.left = newNode;
    			} else {
    				insertNode(root.left, newNode);
    			}
    		}
    		
    		if (newNode.data.compareTo(root.data) > 0) {
    			if(root.right == null) {
    				root.right = newNode;
    			} else {
    				insertNode(root.right, newNode);
    			}
    		}
    	}
    	if(root == null) {
    		root = newNode;
    	}
    }
    
    public void print2D() {
    	print2D(root, 0);
    }
    
    public void print2D(BinNodeGen<E> root, int space) {
    	// Base case  
        if (root == null)  
            return;  
      
        // Increase distance between levels  
        space += COUNT;  
      
        // Process right child first  
        print2D(root.right, space);  
      
        // Print current node after space  
        // count  
        System.out.print("\n");  
        for (int i = COUNT; i < space; i++)  
            System.out.print(" ");  
        System.out.print(root.data + "\n");  
      
        // Process left child  
        print2D(root.left, space);  
    }
    
}

