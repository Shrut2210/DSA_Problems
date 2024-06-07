import java.util.Scanner;

public class P65_Sort_Linked_List {

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

    public static void sort_List()
    {
        Boolean swap = true;

        while (swap) {
            Node head = first;
            Node pre = null;
            Node post = first.link;
            swap = false;

            while (post != null) {
                if (head.info > post.info) {
                    swap = true;
                    if (pre != null) {
                        Node temp = post.link;
                        pre.link = post;
                        post.link = head;
                        head.link = temp;
                    } else {
                        Node temp = post.link;
                        first = post;
                        post.link = head;
                        head.link = temp;
                    }
                    pre = post;
                    post = head.link;
                } else {
                    pre = head;
                    head = post;
                    post = post.link;
                }
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
        P65_Sort_Linked_List node = new P65_Sort_Linked_List();

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

        node.sort_List();
    }
}
