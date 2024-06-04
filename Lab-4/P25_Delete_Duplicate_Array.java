import java.util.Arrays;
import java.util.Scanner;

public class P25_Delete_Duplicate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int ar[] = new int[n];

        for(int i =0;i<n;i++)
        {
            System.out.print("Enter array element : ");
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);

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

        int temp[] = new int[n];
        int j = 0;

        for(int i=0;i<n-1;i++)
        {
            if(ar[i] != ar[i+1])
            {
                temp[j++] = ar[i];
            }
        }

        temp[j++] = ar[n-1];
        int finalarray[] = new int[j];

        for(int i=0;i<j;i++)
        {
            finalarray[i] = temp[i];
            System.out.print(finalarray[i]+" ");
        }
    }
}
