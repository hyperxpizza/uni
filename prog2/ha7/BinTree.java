

public class BinTree {
	public BinNode root = null;
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

    public boolean isSorted(BinNode k){
        if(k != null){
            if(!isSorted(k.left)){
                return false;
            }

            if (k.data <= prev){
                return false;
            }

            prev = k.data;

            return isSorted(k.right);
        }

        return true;
    }

   
    private void insertNode(BinNode neu, BinNode k){
        if(k != null){
            if(neu.data < k.data){
                if(k.left == null){
                    k.left = neu;
                } else {
                    insertNode(neu, k.left);
                }
            }
            if (neu.data > k.data){
                if(k.right == null){
                    k.right = neu;
                }
                else{
                    insertNode(neu, k.right);
                }
            }
            if(neu.data == k.data){
                System.out.println("Knoten vorhanden");
            }
        } else {
            root = neu;
        }
    }

    public void insertNode(int data){
        BinNode n = new BinNode(data);
        insertNode(n, root);
    }
    
   
}