

public class BinTree {
    private BinNode root = null;
    public int prev = Integer.MIN_VALUE;

    public BinTree(){
        root = null;
    }

    public BinTree(BinNode rn){
        root = rn;
    }

    public int countNodes(BinNode k){
        int counter = 0;
        if(k != null){
            counter = 1 + countNodes(k.left) + countNodes(k.right);
        }

        return counter;
    }

    public int countTwoChildrenNodes(BinNode root){
        if(root == null){
            return 0;
        }

        int count = 0;
        if(root.left != null && root.right != null){
            count++;
        }

        count += (countTwoChildrenNodes(root.left) + countTwoChildrenNodes(root.right));
        return count;
    }

    public boolean isSorted(BinNode root){
        if(root != null){
            if(!isSorted(root.left)){
                return false;
            }

            if (root.data <= prev){
                return false;
            }

            prev = root.data;

            return isSorted(root.right);
        }

        return true;
    }

    public boolean removeNode(BinNode root, int key){
        
        
    }
}