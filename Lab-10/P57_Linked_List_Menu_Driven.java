import java.util.Scanner;

public class P57_Linked_List_Menu_Driven {

    static Node head = null;

    static class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value = value;
            this.next = null;
        }
    }

    public static void insert_At_Front()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of node : ");
        int temp = sc.nextInt();

        Node newNode = new Node(temp);

        if(head == null)
        {
        head = newNode;
        }
        else
        {
        Node tempNode = head;
        head = newNode;
        head.next = tempNode;
        }

        return;
    }

    public static void insert_At_Last()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of node : ");
        int temp = sc.nextInt();

        Node newNode = new Node(temp);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node node = head;

            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }

        return;
    }

    public static int delete_At_First()
    {
        if(head.next == null)
        {
            int temp = head.value;
            head = null;
            return temp;
        }
        else
        {
            int temp = head.value;
            head = head.next;

            return temp;
        }
    }

    public static int delete_At_Last()
    {
        if(head.next == null)
        {
            int temp = head.value;
            head = null;
            return temp;
        }
        else
        {
            Node node = head;

            while (node.next.next != null) {
                node = node.next;
            }

            int temp = node.next.value;

            node.next = null;

            return temp;
        }
    }

    public static void display()
    {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        P57_Linked_List_Menu_Driven node = new P57_Linked_List_Menu_Driven();

        Boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter 1. for insert Node at first : \nEnter 2. for insert Node at last : \nEnter 3. for delete Node at first : \nEnter 4. for delete Node at last : \nEnter 5. for display list : \nEnter 6. for exit : ");
            int ope = sc.nextInt();

            switch (ope) {
                case 1:
                    node.insert_At_Front();
                    break;
                case 2:
                    node.insert_At_Last();
                    break;
                case 3:
                    node.delete_At_First();
                    break;
                case 4:
                    node.delete_At_Last();
                    break;
                case 5:
                    node.display();
                    break;
                case 6:
                    isTrue = false;
            }
        }
    }
}


