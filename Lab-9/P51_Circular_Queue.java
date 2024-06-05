import java.util.Scanner;

public class P51_Circular_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circular_Queue q = new Circular_Queue();
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

class Circular_Queue
{
    int n;
    int[] queue;
    int front;
    int rear;

    Circular_Queue()
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
            rear = 1;
        }
        else
        {
            rear++;
        }

        if(front == rear)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter element : ");
            int temp = sc.nextInt();
            queue[rear-1] = temp;    
        }

        if(front == 0)
        {
            front = 1;
        }
    }

    public int deQueue()
    {
        int temp = 0;
        if(front == 0)
        {
            System.out.println("Queue Underflow");
            return 0;
        }
        else{
            temp = queue[front-1];
            queue[front-1] = 0;
        }

        if(front == rear)
        {
            front = 0;
            rear = 0;
            return temp;
        }

        if(front == n)
        {
            front = 0;
        }
        else
        {
            front++;
        }

        return temp;
    }

    public void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(queue[i] + " ");
        }
    }
}