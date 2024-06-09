import java.util.Scanner;

import org.w3c.dom.Node;

public class P74_Split_Circular_List {

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

    static Node First1 = null;
    static Node Last1 = null;
    static Node First2 = null;
    static Node Last2 = null;

    public static void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of node : ");
        int temp = sc.nextInt();
        Node newNode = new Node(temp);

        if(First1 == null)
        {
            First1 = newNode;
            Last1 = newNode;

            First1.link = Last1;
            Last1.link = First1;
        }
        else
        {
            Node next = First1;

            while (next.link != First1) {
                next = next.link;
            }

            next.link = newNode;
            newNode.link = First1;

            Last1 = newNode;
        }
    }

    public static void split_List()
    {
        int count = 1;

        if (First1 == null) {
            System.out.println("Empty List!!!");
            return;
        }
        else
        { 
            Node temp = First1;
            while (temp.link != First1) {
                temp = temp.link;
                count++;
            }
        }

        if(count == 1)
        {
            System.out.println("Only one list created!!");
            System.out.println(First1.info);
            return;
        }

        Node next = First1;
        Node pre = next;
        for(int i=0;i<count/2;i++)
        {
            pre = next;
            next = next.link;
        }

        First2 = next;

        Last1.link = First2;
        Last2 = Last1;

        pre.link = First1;
        Last1 = pre;

        System.out.println("First List !!!!");

        Node t1 = First1;
        while (t1.link != First1) {
            System.out.print(t1.info + " ");
            t1 = t1.link;
        }

        System.out.println(t1.info);

        System.out.println("Second List !!!!");

        Node t2 = First2;
        while (t2.link != First2) {
            System.out.print(t2.info + " ");
            t2 = t2.link;
        }

        System.out.println(t2.info);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P74_Split_Circular_List node = new P74_Split_Circular_List();
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

        node.split_List();
    }
}
