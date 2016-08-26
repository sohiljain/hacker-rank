import java.util.*;

public class TreePreOrder {

    public static void main(String[] args) {
        Node root = new Node("A");
        root.left = new Node("B");
        root.right = new Node("C");
        root.left.left = new Node("D");
        root.left.right = new Node("E");
        root.right.left = new Node("F");
        root.right.right = new Node("G");

        System.out.println("Traversing the Tree in Breadth-First");
        List<String> list = BFS(root);
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println("*****************************************");
        System.out.println("Traversing the Tree in Depth-First");
        list = DFS(root);
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("*****************************************");
    }

    static ArrayList<String> BFS(Node root) {
        // Create a list to return the traversed nodes
        ArrayList<String> returnList = new ArrayList<>();

        // If root is null, return empty list and terminate
        if (root == null) {
            return returnList;
        }

        // Create a queue for BFS
        LinkedList<Node> queue = new LinkedList<>();

        // Add the root node to the queue
        queue.add(root);

        // Iterate over the queue
        while (!queue.isEmpty()) {

            // Remove/poll the firt element from queue and store it in variable n
            Node n = queue.poll();

            // Add the polled element to the returnlist
            returnList.add(n.data);

            // If there is a left or right child, add it to the queue
            if (n.left!=null)
                queue.add(n.left);
            if (n.right!=null)
                queue.add(n.right);
        }

        // The tree has been traversed and all elements added to returnList. Return it back to the function
        return returnList;
    }


    static ArrayList<String> DFS (Node root) {
        // Create a list to return the traversed nodes
        ArrayList<String> returnList = new ArrayList<>();

        // If root is null, return empty list and terminate
        if (root == null) {
            return returnList;
        }

        // Create a stack for BFS
        Stack<Node> stack = new Stack<>();

        // Add the root node to the stack
        stack.push(root);

        // Iterate over the queue
        while (!stack.isEmpty()) {

            // Remove/pop the firt element from stack and store it in variable n
            Node n = stack.pop();

            // Add the polled element to the returnlist
            returnList.add(n.data);

            // If there is a left or right child, add it to the queue
            if (n.right!=null)
                stack.push(n.right);
            if (n.left!=null)
                stack.push(n.left);
        }
        // The tree has been traversed and all elements added to returnList. Return it back to the function
        return returnList;
    }

}

class Node {
    Node left;
    Node right;
    String data;

    Node (String value) {
        this.data = value;
    }
}