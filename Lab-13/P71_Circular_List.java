import java.util.Scanner;

public class P71_Circular_List {

    static class Node
    {
        int info;
        Node link;

        Node(int value)
        {
            this.info = value;
            this.link = null;
        }
    }

    static Node First = null;
    static Node Last = null;

    public static void insertAtFirst()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of node : ");
        int temp = sc.nextInt();
        Node newNode = new Node(temp);

        if(First == null)
        {
            First = newNode;
            Last = newNode;

            First.link = Last;
            Last.link = First;
        }
        else
        {
            Node next = First;
            First = newNode;
            newNode.link = next;

            Last.link = newNode;
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
            Last = newNode;

            First.link = Last;
            Last.link = First;
        }
        else
        {
            Node next = First;

            while (next.link != First) {
                next = next.link;
            }

            next.link = newNode;
            newNode.link = First;

            Last = newNode;
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
            if (First.link == First) { 
                First = null;
                Last = null;
                return;
            }

            while (current.link != First) {
                current = current.link;
            }
            current.link = First.link; 
            First = First.link; 
            return;
        }

        int i = 1;
        for (i = 1; current.link != First && i < index - 1; i++) {
            current = current.link;
        }

        if (current.link == First || current.link.link == First) {
            if(i+1 == index)
            {
                current.link = First;
                Last = current;
            }
            else
            {
                return;
            }
        }

        current.link = current.link.link;
    }

    public static void display_List()
    {
        Node temp = First;

        if(First == null)
        {
            System.out.println("Empty List!!!");
            return;
        }

        while (temp.link != First) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }

        System.out.println(temp.info);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P71_Circular_List node = new P71_Circular_List();

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
