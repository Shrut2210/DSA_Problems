import java.util.Scanner;

public class P61_Queue_Linked_List
{
    static class Node
    {
        int info;
        Node link;

        Node(int data)
        {
            this.info = data;
            this.link = null;
        }
    }

    static Node first = null;

    public static void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of node : ");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if(first == null)
        {
            first = newNode;
        }
        else
        {
            Node temp = first;

            while(temp.link != null)
            {
                temp = temp.link;
            }

            temp.link = newNode;
        }
    }

    public static Node delete()
    {
        Node temp = first;

        if(first == null)
        {
            System.out.println("Queue Underflow...");
        }
        else
        {
            first = first.link;
        }

        return temp;
    }

    public static void printList()
    {
        Node current = first;

        if(first == null)
        {
            System.out.println("Stack Underflow..");
            return;
        }

        System.out.print("Queue : ");
        while(current != null)
        {
            System.out.print(current.info + "  ");
            current = current.link;
        }

        System.out.print("\n");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        P61_Queue_Linked_List node = new P61_Queue_Linked_List();
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter 1. for insert Node : \nEnter 2. for delete Node : \nEnter 3. for display  : \nEnter 4. for exit : ");
            int ope = sc.nextInt();

            switch (ope) {
                case 1:
                    node.insert();
                    break;
                case 2:
                    node.delete();
                    break;
                case 3:
                    node.printList();
                    break;
                case 4:
                    isTrue = false;
            }
        }
    }
}