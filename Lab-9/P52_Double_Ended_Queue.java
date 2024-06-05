import java.util.Scanner;

public class P52_Double_Ended_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue q = new Queue();
        Boolean isTrue = true;

        while(isTrue)
        {
            System.out.println("Enter 1. for insert at front : \nEnter 2. for insert at rear : \nEnter 3. for delete at front : \nEnter 4. for delete at rear : \nEnter 5. for Display \nEnter 6. for Exit : ");
            int temp = sc.nextInt();
            switch (temp) {
                case 1:
                    q.inQueueAtFront();
                    break;

                case 2:
                    q.inQueueAtRear();
                    break;

                case 3:
                    System.out.println("Element is : " + q.deQueueAtFront());
                    break;

                case 4:
                    System.out.println("Element is : " + q.deQueueAtRear());
                    break;

                case 5:
                    q.display();
                    break;

                case 6:
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

    public void inQueueAtRear()
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

    public int deQueueAtFront()
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

    public void inQueueAtFront()
    {
        if(front == 0)
        {
            System.out.print("Queue Empty : ");
            return;
        }
        else if(front == 1)
        {
            System.out.println("Queue Overflow :");
            return;
        }
        else
        {
            front--;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter element : ");
            int temp = sc.nextInt();
            queue[front-1] = temp;
        }
    }

    public int deQueueAtRear()
    {
        int x = 0;

        if(rear == 0)
        {
            System.out.println("Queue underflow :");
            return 0;
        }

        x = queue[rear-1];

        if(rear == front)
        {
            rear = 0;
            front = 0;
        }
        else
        {
            rear--;
        }

        return x;
    }

    public void display()
    {
        if(front > 0)
        {
            for(int i=front-1 ; i < rear; i++)
            {
                System.out.print(queue[i] + " ");
            }
        }
        else
        {
            for(int i=front ; i < rear; i++)
            {
                System.out.print(queue[i] + " ");
            }
        }

        System.out.println();
    }
}