
public class BinarySearchTreeTest {

    public static void main (String[] args) {
        //BinarySearchTree BST = new BinarySearchTree(new Node(7));
        //BST.insert(new Node(4));
        //BST.insert(new Node(12));
        //BST.insert(new Node(2));
        //BST.insert(new Node(6));
        //BST.insert(new Node(3));
        //BST.insert(new Node(5));
        //BST.insert(new Node(9));
        //BST.insert(new Node(19));
        //BST.insert(new Node(8));
        //BST.insert(new Node(11));
        //BST.insert(new Node(15));
        //BST.insert(new Node(20));

        //BinarySearchTree BST = new BinarySearchTree(new Node(0));
        //BST.insert(new Node(10));
        //BST.insert(new Node(20));
        //BST.insert(new Node(30));
        //BST.insert(new Node(40));
        //BST.insert(new Node(50));
        //BST.insert(new Node(60));
        //BST.insert(new Node(70));
        //BST.insert(new Node(80));
        //BST.insert(new Node(90));
        //BST.insert(new Node(100));
        //BSTOperations.balance(BST);

        //Tree that will have a left rotation performed on it
        BinarySearchTree BST = new BinarySearchTree(new Node(10));
        BST.insert(new Node(8));
        BST.insert(new Node(12));
        BST.insert(new Node(11));
        BST.insert(new Node(13));

        //Tree that will have a right rotation performed on it
        //BinarySearchTree BST = new BinarySearchTree(new Node(12));
        //BST.insert(new Node(10));
        //BST.insert(new Node(13));
        //BST.insert(new Node(8));
        //BST.insert(new Node(11));

        BST.balance();
    }
}
