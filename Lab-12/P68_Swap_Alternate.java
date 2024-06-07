import java.util.Scanner;

public class P68_Swap_Alternate {

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

    public static void Swap_Alternate()
    {
        Node head = first;
        Node headNode = first;
        Node pre = head;
        Node post = head.link;
        Node preOld = pre;

        while (head.link != null) {

            if (pre == headNode) {
                first = post;
            }
            else
            {
                preOld.link = post;
            }

            Node temp = post.link;
            post.link = pre;
            
            if(temp == null)
            {
                pre.link = null;
                break;
            }
            else
            {
                pre.link = temp;
                preOld = pre;
                head = head.link;
                pre = head;
                post = head.link;
            }
        }

        Node data = first;

        while (data != null) {
            System.out.print(data.info + " ");
            data = data.link;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P68_Swap_Alternate node = new P68_Swap_Alternate();
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

        node.Swap_Alternate();
    }
}
