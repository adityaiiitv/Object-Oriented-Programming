package pmj.ds.bst.bstbook;

public class BST {

    private BSTNode root;

    public BST() {
        this.root = null;
    }
    
    Book get(int theKey) {
        
        BSTNode node = root;
        //Search alogorithm goes here
        //algo may not be correct just a hint code - correct it if so.
        while ( node != null ) {
            int node_key = node.getKey();
            if ( theKey == node_key ) {
                Book bk = (Book) node.getData();
                return bk.clone();            
            }
            else if ( theKey < node_key ) {
                node = node.getLeftChild();
            }
            else if ( theKey > node_key ) {
                node = node.getRightChild();
            }
        }
        return null;        
    }
    
    void put(int theKey, Book x) {
        
        BSTNode new_node = new BSTNode(theKey, x);
        //Insert algorithm goes here        
    
    }
    
    java.lang.Object remove(int theKey) {
        Object obj = null;

        return obj;
    }
    
    public boolean isEmpty() {
    
        return root == null ? true : false;
    }
    public void preOrderOutput(java.io.PrintStream out) {
    
    }
    public void inOrderOutput(java.io.PrintStream out) {
    
    }
    public void postOrderOutput(java.io.PrintStream out) {
    
    }
    
}
