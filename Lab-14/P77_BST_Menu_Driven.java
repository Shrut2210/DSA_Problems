import java.util.Scanner;

public class P77_BST_Menu_Driven {

    static class Node
    {
        int value;
        Node left;
        Node right;

        Node(int data)
        {
            this.value = data;
            left = null;
            right = null;
        }
    }

    static Node head = null;

    public static void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter node value : ");
        int value = sc.nextInt();
        Node n = new Node(value);

        if(head == null)
        {
            head = n;
        }
        else
        {
            Node temp = head;
            while(true)
            {
                if(value < temp.value && temp.left != null)
                {
                    temp = temp.left;
                }
                else if(value < temp.value && temp.left == null)
                {
                    temp.left = n;
                    break;
                }
                else if(value > temp.value && temp.right != null)
                {
                    temp = temp.right;
                }
                else if(value > temp.value && temp.right == null)
                {
                    temp.right = n;
                    break;
                }
            }
        }
    }

    public static void delete()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter node value to delete : ");
        int data = sc.nextInt();

        Node root = head;
        Node pre = root;
        Node suc = root;
        int f = 0;

        if(data < root.value)
        {
            pre = suc;
            suc = suc.left;

            while(data != suc.value)
            {
                pre = suc;

                if(data < suc.value)
                {
                    suc = suc.left;
                }
                else if(data > suc.value)
                {
                    suc = suc.right;
                }
            }
            f = 1;
        }
        else if(data > root.value)
        {
            pre = suc;
            suc = suc.right;

            while(data != suc.value)
            {
                pre = suc;

                if(data < suc.value)
                {
                    suc = suc.left;
                }
                else if(data > suc.value)
                {
                    suc = suc.right;
                }
            }

            f = 1;
        }
        else
        {
            Node temp = root.right;
            if(root.right == null)
            {
                head = root.left;
            }
            else if(temp.left == null)
            {
                temp.left = root.left;
                head = temp;
            }
            else if(temp.left != null)
            {
                while(temp.left != null)
                {
                    temp = temp.left;
                }

                temp.left = head.left;
                head = head.right;
            }
        }

        if(f == 1)
        {
            if(suc.left == null && suc.right == null)
            {
                if(pre.value > suc.value)
                {
                    pre.left = null;
                }
                else if(pre.value < suc.value)
                {
                    pre.right = null;
                }
            }
            else if(suc.left != null && suc.right == null)
            {
                if(pre.value > suc.value)
                {
                    pre.left = suc.left;
                }
                else if(pre.value < suc.value)
                {
                    pre.right = suc.left;
                }
            }
            else if(suc.left == null && suc.right != null)
            {
                if(pre.value > suc.value)
                {
                    pre.left = suc.right;
                }
                else if(pre.value < suc.value)
                {
                    pre.right = suc.right;
                }
            }
            else if(suc.left != null && suc.right != null)
            {
                if(pre.value > suc.value)
                {
                    suc.right.left = suc.left;
                    pre.left = suc.right;
                }
                else if(pre.value < suc.value)
                {
                    suc.right.left = suc.left;
                    pre.right = suc.right;
                }
            }
        }
    }

    public static void search()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter node value in search : ");
        int value = sc.nextInt();
        Node n = new Node(value);

        if(head == null)
        {
            head = n;
        }
        else
        {
            Node temp = head;
            while(true)
            {
                if(value < temp.value && temp.left != null)
                {
                    temp = temp.left;
                }
                else if(value < temp.value && temp.left == null)
                {
                    System.out.println("No node found!!!");
                    break;
                }
                else if(value > temp.value && temp.right != null)
                {
                    temp = temp.right;
                }
                else if(value > temp.value && temp.right == null)
                {
                    System.out.println("No node found!!!");
                    break;
                }
                else if(value == temp.value)
                {
                    System.out.println("Node found successfull!!!");
                    break;
                }
            }
        }
    }

    public static void display(Node root)
    {
        if(root != null)
        {
            display(root.left);
            System.out.print(root.value + " ");
            display(root.right);
        }
    }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    P77_BST_Menu_Driven node = new P77_BST_Menu_Driven();
    Boolean isTrue = true;

    while(isTrue)
        {
            System.out.print("1. Insertion Node \n2. Delete Node \n3. Display : \n4. Search : \n5. Exit : ");
            String ope = sc.nextLine();

            switch(ope)
            {
                case "1" : 
                node.insert();
                    break;

                case "2" : 
                node.delete();
                    break;

                case "3":
                node.display(head);
                break;

                case "4":
                node.search();
                break;

                case "5":
                    isTrue = false;
            }
        }
 }   
}
