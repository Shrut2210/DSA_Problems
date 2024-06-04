import java.util.Scanner;

public class P24_SortedDelete
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int[] ar2 = new int[n-1];

        for(int i =0;i<n;i++)
        {
            System.out.print("Enter array element : ");
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

        System.out.print("Enetr Location : ");
        int l = sc.nextInt();
        
        
        for(int i=0;i<l;i++)
        {
            ar2[i] = ar[i];
        }

        for(int i=l;i<n-1;i++)
        {
            ar2[i] = ar[i+1];
        }

        for(int i=0;i<n-1;i++)
        {
            System.out.print(ar2[i] + " ");
        }
    }

}