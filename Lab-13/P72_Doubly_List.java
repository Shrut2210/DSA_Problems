import java.util.Scanner;

public class P72_Doubly_List {

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

    public static void insertAtFirst()
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
            First = newNode;
            newNode.right = next;
        }
    }

    public static void insertAtLast()
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

    public static void delete()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index to delete node : ");
        int index = sc.nextInt();

        if (index <= 0 || First == null) {
            System.out.println("No node found ");
            return;
        }

        Node current = First;

        if (index == 1) {
            if (First.right == null) { 
                First = null;
                return;
            }

           First = First.right;
           First.left = null;
            return;
        }

        int i = 1;
        Node pre = null;
        for (i = 1; current.right != null && i < index - 1; i++) {
            pre = current;
            current = current.right;
        }

        if (current.right == null) {
            if(i+1 == index)
            {
                pre.right = current.right;
                current.left = pre;
            }
            else
            {
                return;
            }
        }

        current.right = current.right.right;
    }

    public static void display_List()
    {
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
        P72_Doubly_List node = new P72_Doubly_List();
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter 1. for insert Node at first : \nEnter 2. for insert Node at last : \nEnter 3. for delete node : \nEnter 4. for display  : \nEnter 5. for exit : ");
            int ope = sc.nextInt();

            switch (ope) {
                case 1:
                    node.insertAtFirst();
                    break;
                case 2:
                    node.insertAtLast();
                    break;
                case 3:
                    node.delete();
                    break;
                case 4:
                    node.display_List();
                    break;
                case 5:
                    isTrue = false;
            }
        }
    }
}
