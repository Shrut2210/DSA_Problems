import java.util.Scanner;

public class P79_Same_Tree {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public class IdenticalBinaryTrees {
        public static boolean isIdentical(Node r1, Node r2) {
            if (r1 == null && r2 == null) 
                return true;
            if (r1 == null || r2 == null) 
                return false;

            while (r1 != null && r2 != null) {
                if (r1.data != r2.data) 
                    return false;

                if (r1.left == null) {
                    r1 = r1.right;
                } else { 
                    Node pre = r1.left;
                    while (pre.right != null && pre.right != r1)
                        pre = pre.right;
                    if (pre.right == null) { 
                        pre.right = r1;
                        r1 = r1.left;
                    } else { 
                        pre.right = null;
                        r1 = r1.right;
                    }
                }

                if (r2.left == null) {
                    r2 = r2.right;
                } else {
                    Node pre = r2.left;
                    while (pre.right != null && pre.right != r2)
                        pre = pre.right;
                    if (pre.right == null) {
                        pre.right = r2;
                        r2 = r2.left;
                    } else {
                        pre.right = null;
                        r2 = r2.right;
                    }
                }
            }

            return (r1 == null && r2 == null); 
        }

    }
        public static void main(String[] args) {

            Node root1 = new Node(1);
            root1.left = new Node(2);
            root1.right = new Node(3);
            root1.left.right = new Node(4);
            root1.left.left = new Node(5);

            Node root2 = new Node(1);
            root2.left = new Node(2);
            root2.right = new Node(3);
            root2.left.left = new Node(4);
            root2.left.right = new Node(5);

            if (IdenticalBinaryTrees.isIdentical(root1, root2))
                System.out.println("Both trees are same");
            else
                System.out.println("Both trees are not not same");
        }
}
