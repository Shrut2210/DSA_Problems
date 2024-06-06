import java.util.Scanner;

public class P56_Node_Structure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Node node = new Node();
        System.out.println(node.value);
    }
}

class Node
{
    int value;
    Node next;

    Node()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of node : ");
        value = sc.nextInt();

        next = null;
    }

}
