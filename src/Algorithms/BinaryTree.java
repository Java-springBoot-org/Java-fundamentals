package Algorithms;

//Define a class for your binary tree node. This class should have at least two instance variables:
//        one for the data stored in the node, and one for each child of the node. For example:

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        this.data = data;
    }
}
//
//    Create a class for your binary tree. This class should have at least one instance variable,
//        which is a reference to the root node of the tree. For example:

public class BinaryTree {
    BinaryTreeNode root;

    public BinaryTree() {
        root = null;
    }
//    Implement methods for inserting nodes into the tree. There are several different ways to do this, but one common approach is to use a recursive method that inserts a new node into the left subtree if its data is less than the data at the current node, or into the right subtree if its data is greater than the data at the current node. For example:
public void insert(int data) {
    root = insert(root, data);
}

    private BinaryTreeNode insert(BinaryTreeNode node, int data) {
        if (node == null) {
            node = new BinaryTreeNode(data);
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

//    Implement a method for searching the tree for a specific value. This can also be done using a recursive method that compares the search value to the data at each node and either continues the search in the left or right subtree, depending on whether the search value is less than or greater than the data at the current node. If the value is found, the method should return the node containing the value; otherwise, it should return null. For example:
public BinaryTreeNode search(int data) {
    return search(root, data);
}

    private BinaryTreeNode search(BinaryTreeNode node, int data) {
        if (node == null || node.data == data) {
            return node;
        }
        if (data < node.data) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

}

