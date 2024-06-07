import java.util.Scanner;

public class P66_Replace_Kth_Element {

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

    public static void swapNode(int index)
    {
        int count = 0;
        int total = 0;

        Node head = first;

        while(head != null)
        {
            count++;
            head = head.link;
        }

        head = first;

        total = count;

        if(index > count && head == null)
        {
            System.out.println("Node not found!!!");
        }
        else
        {
            Node pre1 = null;
            Node head1 = first;

            for(int i=1;i<index;i++)
            {
                pre1 = head1;
                head1 = head1.link;
            }

            Node pre2 = null;
            Node head2 = first;

            for(int i=1;i<total-index+1;i++)
            {
                pre2 = head2;
                head2 = head2.link;
            }

            if(pre1 != null)
            {
                pre1.link = head2;
            }
            else
            {
                first = head2;
            }

            if(pre2 != null)
            {
                pre2.link = head1;
            }
            else
            {
                first = head1;
            }

            Node temp = head1.link;
            head1.link = head2.link;
            head2.link = temp;
        }

        Node data = first;

        while (data != null) {
            System.out.print(data.info + " ");
            data = data.link;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        P66_Replace_Kth_Element node = new P66_Replace_Kth_Element();
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

        System.out.println("Enter index to swap : ");
        int swap = sc.nextInt();

        node.swapNode(swap);
    }
}
