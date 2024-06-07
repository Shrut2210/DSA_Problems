import java.util.Scanner;

public class P62_Remove_Duplicate {

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

        Node tempNode = first;

        while (tempNode != null) {
            System.out.print( tempNode.info + " ");
            tempNode = tempNode.link;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        P62_Remove_Duplicate node = new P62_Remove_Duplicate();
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
