public class BinTree {

    private BinNode root = null;
    
    public BinTree(){
        root = null;
    }

    public BinTree(BinNode rn){
        root = rn;
    }


    public BinNode getRoot() {
        return root;
    }

   
    /**
     * counts the number of nodes of the binary tree having two children nodes
     * @param k given node
     * @return the number of nodes
     */
    public int countTwoChildrenNodes(BinNode k){
        if(k == null){
            return 0;
        }
        int count = 0;
        if(k.left != null && k.right != null){
            count++;
        }
        count += (countTwoChildrenNodes(k.left) + countTwoChildrenNodes(k.right));
        return count;
    }

    /**
     * wrapper method for countTwoChildrenNodes(BinNode k)
     * @return the number of nodes
     */
    public int countTwoChildrenNodes(){
        return countTwoChildrenNodes(root);
    }

    /**
     * checks either the binary tree is sorted or not
     * @param k given node
     * @return true if the tree is sorted
     */
    public boolean isSorted(BinNode k, int min, int max){
        if(k == null) {
        	return true;
        }
        
        if (k.data < min || k.data > max) {
        	return false;
        }
        
        return (isSorted(k.left, min, k.data-1) && isSorted(k.right, k.data+1, max));
    }


    /**
     * wrapper method for isSorted(BinNode k)
     * @return true if the tree is sorted
     */
    public boolean isSorted() throws NullPointerException{
        if(root == null) {
        	throw new NullPointerException();
        }
    	return isSorted(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /**
     * return the minimum value from the tree
     * @param k given node
     * @return the minimum value
     */
    public int minValue(BinNode k){
        if (k.left != null){
            return minValue(k.left);
        }
        return k.data;
    }

    
    
    public boolean removeNode(int value) {
        return (removeNode(getRoot(), value) != null);
    }
    
    public BinNode removeNode(BinNode k, int value) throws NullPointerException{
        if(k == null){
            throw new NullPointerException("given value is not in the tree");
        }
        if(value < k.data){ // search in left part of the tree if the given value is smaller than the actual value
            k.left = removeNode(k.left, value);
        }else if(value > k.data){ // search in right part of the tree if the given value is larger than the actual value
            k.right = removeNode(k.right, value);
        }else{ // node to be removed is found
            if (k.left == null && k.right == null){
                return null;
            }else if(k.right == null){
                return k.left; // replaces the node with its left child
            }else if(k.left == null){
                return k.right;  // replaces the node with its right child
            }else{
                k.data = minValue(k.right); // finds the smallest node and overwrites the value
                k.right = removeNode(k.right, k.data); // delete the node form the right subtree
            }
        }
        return k;
    }
  
    

    public void printBinTree(BinNode b){
        if(b!=null){
            System.out.print("(");
            printBinTree(b.left);
            System.out.print(" " + b.data + " ");
            printBinTree(b.right);
            System.out.print(")");
        }
    }

    public void printBinTree() { //Verpackungsmethode
        printBinTree(root);
    }

}