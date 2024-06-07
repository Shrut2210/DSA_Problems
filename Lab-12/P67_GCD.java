import java.util.Scanner;

public class P67_GCD {

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

    public static void gcd_Added_List()
    {

        Node head = first;
        Node next = head.link;

        while (next != null) {
            int val1 = head.info;
            int val2 = next.info;

            int temp;

            while(val2!=0)
            {
                temp = val2;
                val2 = val1%val2;
                val1 = temp;
            }

            Node newNode = new Node(val1);

            head.link = newNode;
            newNode.link = next;

            head = next;
            next = next.link;
        }

        Node data = first;

        while (data != null) {
            System.out.print(data.info + " ");
            data = data.link;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P67_GCD node = new P67_GCD();

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

        node.gcd_Added_List();
    }
}
