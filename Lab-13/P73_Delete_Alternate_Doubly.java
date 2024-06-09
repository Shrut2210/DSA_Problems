import java.util.Scanner;

public class P73_Delete_Alternate_Doubly {

    static class Node
    {
        int info;
        Node left;
        Node right;

        Node(int value)
        {
            this.info = value;
            this.left = null;
            this.right = null;
        }
    }

    static Node First = null;

    public static void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of node : ");
        int temp = sc.nextInt();
        Node newNode = new Node(temp);

        if(First == null)
        {
            First = newNode;
        }
        else
        {
            Node next = First;

            while (next.right != null) {
                next = next.right;
            }

            next.right = newNode;
        }
    }

    public static void remove_Alternate_Node()
    {

        Node pre = null;
        Node head = First;
        Node post = head.right;

        if(First == null)
        {
            System.out.println("No node found!!!");
            return;
        }

        while (head != null) {
            if(pre == null)
            {
                pre = head.right;
                First = pre;
                pre.left = null;
            }
            else
            {
                if(post == null)
                {
                    pre.right = null;
                    break;
                }
                else
                {
                    pre.right = post;
                    post.left = pre;

                    pre = pre.right;
                }
            }

            if(post.right == null)
            {
                head = null;
            }
            else
            {
                head = post.right;
                post = head.right;
            }
        }


        Node temp = First;

        if(First == null)
        {
            System.out.println("Empty List!!!");
            return;
        }

        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.right;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P73_Delete_Alternate_Doubly node = new P73_Delete_Alternate_Doubly();
        Boolean isTrue = true;

        while (isTrue) {
            node.insert();

            System.out.println("Want to add more ???");
            String ans = sc.nextLine();

            if(ans.equals("yes") || ans.equals("y"))
            {
                isTrue = true;
            }
            else
            {
                isTrue = false;
            }
        }

        node.remove_Alternate_Node();
    }
}
