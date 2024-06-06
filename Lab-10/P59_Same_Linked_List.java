import java.util.Scanner;

public class P59_Same_Linked_List {
    Node head = null;

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

    public void insert()
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

    

    static class CheckList {
        public static void IsSameList(Node temp1, Node temp2)
        {
            System.out.println(temp1.value + " " + temp2.value);
            while (temp1.next != null) {
                if(temp1.value != temp2.value)
                {
                    System.out.println("List are not same !!!");
                    return;
                }

                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            if(temp2.next != null)
            {
                System.out.println("List are not same!!!");
                return;
            }
            else
            {
                System.out.println("List are same!!!!");
                return;
            }
        }
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        P59_Same_Linked_List node1 = new P59_Same_Linked_List();
        System.out.println("Enter nodes in first list!!!");

        Boolean isTrue = true;

        while (isTrue) {
            node1.insert();

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

        P59_Same_Linked_List node2 = new P59_Same_Linked_List();
        System.out.println("Enter nodes in second list!!!");

        isTrue = true;

        while (isTrue) {
            node2.insert();

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

        CheckList node3 = new CheckList();
        node3.IsSameList(node1.head, node2.head);
    }
}
