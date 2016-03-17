import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TreePreOrder {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TreePreOrder. */



    }

    public void createTree(Node root, int []arr){



    }

    static void Preorder(Node root) {
        if(root.left!=null) {
            System.out.print(root.data+" ");
            Preorder(root.left);
        }
        if(root.right!=null) {
            Preorder(root.right);
        }
        if(root.left==null && root.right==null)
            System.out.print(root.data+" ");
    }
}

class Node {
    Node left;
    Node right;
    int data;
}