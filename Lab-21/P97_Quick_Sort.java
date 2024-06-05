import java.util.Scanner;

public class P97_Quick_Sort
{
    static int pivot = 0;
    static int temp = 0;

    public static void Quick(int[] ar, int left, int right)
    {
        if(left < right)
        {
            int t = Part(ar, left, right);
            Quick(ar, left, t-1);
            Quick(ar, t+1, right);
        }
    }

    public static int Part(int[] ar, int left, int right)
    {
        pivot = ar[right];
        temp = left - 1;

        for(int i=left;i<right;i++)
        {
            if(ar[i] <= pivot)
            {
                temp++;
                int x = ar[i];
                ar[i] = ar[temp];
                ar[temp] = x;
            }
        }

        int x = ar[right];
        ar[right] = ar[temp+1];
        ar[temp+1] = x;

        return temp+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter " + (i+1) + " Element : ");
            ar[i] = sc.nextInt();
        }

        Quick(ar, 0, n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}