import java.util.Scanner;

public class P78_BST_Traversal {

    static class Node
    {
        int value;
        Node left;
        Node right;

        Node(int data)
        {
            this.value = data;
            left = null;
            right = null;
        }
    }

    static Node head = null;

    public static void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter node value : ");
        int value = sc.nextInt();
        Node n = new Node(value);

        if(head == null)
        {
            head = n;
        }
        else
        {
            Node temp = head;
            while(true)
            {
                if(value < temp.value && temp.left != null)
                {
                    temp = temp.left;
                }
                else if(value < temp.value && temp.left == null)
                {
                    temp.left = n;
                    break;
                }
                else if(value > temp.value && temp.right != null)
                {
                    temp = temp.right;
                }
                else if(value > temp.value && temp.right == null)
                {
                    temp.right = n;
                    break;
                }
            }
        }
    }

    public static void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root)
    {
        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P78_BST_Traversal node = new P78_BST_Traversal();

        Boolean isTrue = true;

    while(isTrue)
        {
            System.out.print("1. Insert Node \n2. inorder Node \n3. preorder : \n4. postorder : \n5. Exit : ");
            String ope = sc.nextLine();

            switch(ope)
            {
                case "1" : 
                node.insert();
                    break;

                case "2" : 
                node.inOrder(head);
                    break;

                case "3":
                node.preOrder(head);
                break;

                case "4":
                node.postOrder(head);
                break;

                case "5":
                    isTrue = false;
            }
        }
    }
}
