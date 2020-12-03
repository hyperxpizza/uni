import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

    @Test
    public void testCountTwoChildrenNodesEmpty() {
        BinTree tree = new BinTree();
        assertEquals(0, tree.countTwoChildrenNodes());
    }

    @Test
    public void testCountTwoChildrenNodesRoot() {
        BinNode root = new BinNode(1);
        BinTree tree = new BinTree(root);
        assertEquals(0, tree.countTwoChildrenNodes());
    }

    @Test
    public void testCountTwoChildrenNodes1() {
    	BinNode root = new BinNode(7);
    	BinTree tree = new BinTree(root);
    	
    	// 1st level
    	root.right = new BinNode(9);
    	root.left = new BinNode(4);
    	
    	//2nd level
    	root.right.left = new BinNode(8);
    	root.left.right = new BinNode(5);
    	root.left.left = new BinNode(2);
    	
    	//3nd level
    	root.left.left.right = new BinNode(3);
    	root.left.left.left = new BinNode(1);
        
        assertEquals(3, tree.countTwoChildrenNodes());
    }
    
    @Test
    public void testCountTwoChildrenNodes2() {
    	BinNode root = new BinNode(6);
    	BinTree tree = new BinTree(root);
    	// 1st level
    	root.right = new BinNode(9);
    	root.left = new BinNode(4);
    	
    	// 2nd level
    	root.left.left = new BinNode(2);
    	root.left.right = new BinNode(7);
    
    	assertEquals(2, tree.countTwoChildrenNodes());
    }

    
    
    
    
    @Test(expected = NullPointerException.class)
    public void isSortedEmpty() {
    	BinTree tree = new BinTree();
    	System.out.println(tree.isSorted());
    }
    
    @Test
    public void isSortedRoot() {
    	BinNode root = new BinNode(1);
    	BinTree tree = new BinTree(root);
        assertEquals(true, tree.isSorted());
    }
    
    
    @Test
    public void testIsSorted1() {
    	BinNode root = new BinNode(7);
    	BinTree tree = new BinTree(root);
    	
    	// 1st level
    	root.right = new BinNode(9);
    	root.left = new BinNode(4);
    	
    	//2nd level
    	root.right.left = new BinNode(8);
    	root.left.right = new BinNode(5);
    	root.left.left = new BinNode(2);
    	
    	//3nd level
    	root.left.left.right = new BinNode(3);
    	root.left.left.left = new BinNode(1);
    	
        
        assertEquals(true, tree.isSorted());
    }
    
    @Test
    public void testIsSorted2() {
    	BinNode root = new BinNode(6);
    	BinTree tree = new BinTree(root);
    	// 1st level
    	root.right = new BinNode(9);
    	root.left = new BinNode(4);
    	
    	// 2nd level
    	root.left.left = new BinNode(2);
    	root.left.right = new BinNode(7);
        
        assertEquals(false, tree.isSorted());
        
    }
   
   
    @Test(expected = NullPointerException.class)
    public void testRemoveNodeEmpty() {
    	BinTree tree = new BinTree();
    	assertEquals(false, tree.removeNode(1));
    }
    
    @Test
    public void testRemoveNodeRoot() {
    	BinNode root = new BinNode(6);
    	BinTree tree = new BinTree(root);
    	System.out.println(tree.removeNode(6));
    	
    }
    
    @Test
    public void testRemoveNode1() {
    	BinNode root = new BinNode(7);
    	BinTree tree = new BinTree(root);
    	
    	// 1st level
    	root.right = new BinNode(9);
    	root.left = new BinNode(4);
    	
    	//2nd level
    	root.right.left = new BinNode(8);
    	root.left.right = new BinNode(5);
    	root.left.left = new BinNode(2);
    	
    	//3nd level
    	root.left.left.right = new BinNode(3);
    	root.left.left.left = new BinNode(1);
    	assertEquals(true, tree.removeNode(1));
    }
    
    @Test
    public void testRemoveNode2() {
    	BinNode root = new BinNode(6);
    	BinTree tree = new BinTree(root);
    	// 1st level
    	root.right = new BinNode(9);
    	root.left = new BinNode(4);
    	
    	// 2nd level
    	root.left.left = new BinNode(2);
    	root.left.right = new BinNode(7);
    	assertEquals(true, tree.removeNode(4));
    }
   
    
   
    
}
