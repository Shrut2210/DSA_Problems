public class P80_Symmetric {
    static class Node {
        int key;
        Node left, right;
        Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

        static Node root = null;

        boolean isMirror(Node node1, Node node2)
        {
            if (node1 == null && node2 == null)
                return true;

            if (node1 != null && node2 != null
                && node1.key == node2.key)
                return (isMirror(node1.left, node2.right)
                        && isMirror(node1.right, node2.left));

            return false;
        }

        boolean isSymmetric()
        {
            return isMirror(root, root);
        }
        

        public static void main(String args[])
        {
            P80_Symmetric tree = new P80_Symmetric();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(2);
            tree.root.left.left = new Node(3);
            tree.root.left.right = new Node(4);
            tree.root.right.left = new Node(3);
            tree.root.right.right = new Node(4);
            boolean output = tree.isSymmetric();
            if (output == true)
                System.out.println("Symmetric");
            else
                System.out.println("Not symmetric");
        }
}

