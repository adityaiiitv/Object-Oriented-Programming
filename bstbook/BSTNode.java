package pmj.ds.bst.bstbook;

public class BSTNode {
    private Object data;
    private int key;
    private BSTNode leftChild;    // left subtree
    private BSTNode rightChild;   // right subtree

    // constructors
    public BSTNode() {
        key = 0;
        data = null;
        leftChild = null;
        rightChild = null;
    }

    public BSTNode(int theKey, Object thedata){
        key = theKey;
        data = thedata;
        leftChild = null;
        rightChild = null;
    }

   // accessor methods
    public BSTNode getLeftChild() {return leftChild;}
    public BSTNode getRightChild() {return rightChild;}
    public Object getData() {return data;}
    public int getKey() {return key;}

    // mutator methods
    public void setLeftChild(BSTNode theLeftChild) {leftChild = theLeftChild;}
    public void setRightChild(BSTNode theRightChild){rightChild = theRightChild;}
    public void setKey(int thekey) {key = thekey;}
    public void setData(Book thedata) {data = thedata;}

    @Override
    public String toString() {return data.toString();}
}
