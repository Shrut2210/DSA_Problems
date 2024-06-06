import java.util.Scanner;

public class P58_Count_Node {

    static Node First;
    static Node Last;

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

    public static void insert(int value)
    {
        Node newNode = new Node(value);

        if(First == null)
        {
            First = newNode;
            Last = newNode;
            First.link = Last;
            Last.link = First;
        }
        else
        {
            Node temp = First;

            while(temp.link != First)
            {
                temp = temp.link;
            }

            temp.link = newNode;
            Last = newNode;
            newNode.link = First;
        }

    }

    public int Count_Node()
    {
        Node node = First;
        int count = 0;
        
        while (node != Last) {
            count++;
            node = node.link;
        }

        return (count+1);
    }

    public static void main(String[] args) {
        P58_Count_Node node = new P58_Count_Node();

        Scanner sc = new Scanner(System.in);
        
        Boolean isTrue = true;

        while (isTrue) {
            System.out.println("Enter node value : ");
            node.insert(sc.nextInt());
            sc.nextLine();

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

        System.out.println("Total Node : " + node.Count_Node());
    }
}
