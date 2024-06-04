import java.util.Scanner;

public class P23_SortedInsert
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int[] ar2 = new int[n+1];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter number : ");
            ar[i] = sc.nextInt();
        }

        // for(int i=0;i<n;i++)
        // {
        //     int temp = 0;
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(ar[i] > ar[j])
        //         {
        //             temp = ar[j];
        //             ar[j] = ar[i];
        //             ar[i] = temp;
        //         }
        //     }
        // }


        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int j=0;
        while(num>=ar[j])
        {
            ar2[j] = ar[j];
            j++;
        }

        ar2[j] = num;
        j++;
        while(j<=n)
        {
            ar2[j] = ar[j-1];
            j++;
        }

        for(int i=0;i<=n;i++)
        {
            System.out.print(ar2[i] + " ");
        }
    }
}