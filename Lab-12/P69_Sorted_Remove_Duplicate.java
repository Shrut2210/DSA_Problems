import java.util.Scanner;

public class P69_Sorted_Remove_Duplicate {

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
            Node head = first;
            Node pre = null;

            if(first.info >= newNode.info)
            {
                first = newNode;
                newNode.link = head;
            }
            else
            {
                while (head.info < newNode.info && head.link != null) {
                    pre = head;
                    head = head.link;
                }

                if(head.link == null)
                {
                    head.link = newNode;
                }
                else
                {
                    pre.link = newNode;
                    newNode.link = head;
                }
            }
        }
    }

    public static void remove_Duplicate()
    {
        Node current = first;
        while (current != null && current.link != null) {
            Node preNode = current;
            Node nextNode = current.link;

            while (nextNode != null) {
                if (current.info == nextNode.info) {
                    preNode.link = nextNode.link;
                } else {
                    preNode = nextNode;
                }
                nextNode = nextNode.link;
            }

            current = current.link;
        }

        Node data = first;

        while (data != null) {
            System.out.print(data.info + " ");
            data = data.link;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        P69_Sorted_Remove_Duplicate node = new P69_Sorted_Remove_Duplicate();
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

        node.remove_Duplicate();
    }
}
