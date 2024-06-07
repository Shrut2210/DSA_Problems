import java.util.Scanner;

public class P63_Copy_Linked_List {

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

    public static void copy_List()
    {
        P63_Copy_Linked_List copyNode = new P63_Copy_Linked_List();

        Node current = first;
        copyNode.first = new Node(current.info);
        Node newCurrent = copyNode.first;

        while (current.link != null) {
            current = current.link;
            newCurrent.link = new Node(current.info);
            newCurrent = newCurrent.link;
        }

        Node temp = copyNode.first;

        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P63_Copy_Linked_List node = new P63_Copy_Linked_List();
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

        P63_Copy_Linked_List copyNode = new P63_Copy_Linked_List();
        copyNode.copy_List();
    }
}
