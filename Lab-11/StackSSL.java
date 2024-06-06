import java.util.Scanner;

public class StackSSL
{
    static class Node
    {
        String info;
        Node next;

        Node(String data)
        {
            this.info = data;
            this.next = null;
        }
    }

    static Node first = null;

    public static void insert(String data)
    {
        Node n = new Node(data);

        if(first == null)
        {
            first = n;
        }
        else
        {
            Node temp = first;
            first = n;
            n.next = temp;
        }
    }

    public static Node delete()
    {
        Node temp = first;

        if(first == null)
        {
            System.out.print("Stack Underflow..");
            return null;
        }
        else
        {
            first = first.next;
        }

        return temp;
    }

    public static void printList()
    {
        Node current = first;

        if(first == null)
        {
            System.out.print("Stack Underflow..");
            return;
        }

        while(current != null)
        {
            System.out.print(current.info + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSSL st = new StackSSL();

        st.insert(sc.nextLine());
        st.insert(sc.nextLine());
        st.insert(sc.nextLine());
        st.insert(sc.nextLine());
        st.insert(sc.nextLine());

        st.delete();
        st.delete();
        st.delete();
        st.delete();

        st.printList();
    }
}