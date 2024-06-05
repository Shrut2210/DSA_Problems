import java.util.*;

public class P50_Queue_Menu_Driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue q = new Queue();
        Boolean isTrue = true;

        while(isTrue)
        {
            System.out.println("Enter 1. for Inqueue \nEnter 2. for Dequeue \nEnter 3. for Display \nEnter 4. for Exit : ");
            int temp = sc.nextInt();
            switch (temp) {
                case 1:
                    q.inQueue();
                    break;

                case 2:
                    System.out.println("Element is : " + q.deQueue());
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    isTrue = false;
            }
        }
    }
}

class Queue
{
    int n;
    int[] queue;
    int front;
    int rear;

    Queue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of queue : ");
        n = sc.nextInt();

        queue = new int[n];

        front = 0;
        rear = 0;
    }

    public void inQueue()
    {
        if(rear == n)
        {
            System.out.print("Queue overflow : ");
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter element of queue : ");
            queue[rear] = sc.nextInt();
            rear++;
        }

        if(front == 0)
        {
            front = 1;
        }
    }

    public int deQueue()
    {
        int x=0;
        if((front-1) == rear)
        {
            System.out.print("Queue underflow : ");
        }
        else
        {
            x = queue[front-1];
            front++;
        }

        return x;
    }

    public void display()
    {
        for(int i=front-1 ; i < rear; i++)
        {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}