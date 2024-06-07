import java.util.Scanner;

public class P64_Reverse_Linked_List {

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

    public static void reverse_List()
    {
        Node temp = first;
        Node startNode = first;
        Node pre = temp;
        Node post = temp.link;

        while (temp != null) {
    
            temp = post.link;

            if(pre == startNode)
            {
                pre.link = null;
            }

            post.link = pre;

            pre = post;
            post = temp;

            first = pre;
        }

        Node data = first;

        while (data != null) {
            System.out.print(data.info + " ");
            data = data.link;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        P64_Reverse_Linked_List node = new P64_Reverse_Linked_List();
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

        node.reverse_List();
    }
}
