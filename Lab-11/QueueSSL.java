import java.util.Scanner;

public class QueueSSL
{
    static class Node
    {
        String info;
        Node next;

        Node(String data)
        {
            this.info = data;
            this.next = null;
        }
    }

    static Node first = null;

    public static void insert(String data)
    {
        Node n = new Node(data);

        if(first == null)
        {
            first = n;
        }
        else
        {
            Node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = n;
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
            first = first.next;
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
            current = current.next;
        }

        System.out.print("\n");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        QueueSSL qu = new QueueSSL();

        while(true)
        {
            System.out.print("1. Insertion at start \n2. Deletion from start \n3. Exit : \n");
            String ope = sc.nextLine();

            switch(ope)
            {
                case "1" : qu.insert(sc.nextLine());
                    qu.printList();
                    break;

                case "2" : qu.delete();
                    qu.printList();
                    break;

                case "3" : 
                sc.close();
                System.exit(0);
            }
        }
    }
}