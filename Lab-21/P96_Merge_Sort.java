import java.util.Scanner;

public class P96_Merge_Sort {
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

        mergeSort(ar);

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }

    public static void mergeSort(int[] ar)
    {
        int n = ar.length;

        int[] U = new int[n/2];
        int[] V = new int[n/2];

        for(int i=0;i<n/2;i++)
        {
            U[i] = ar[i];
        }

        int index = 0;

        for(int i=n/2;i<n;i++)
        {
            V[index] = ar[i];
            index++;
        }

        mergeSort(U);
        mergeSort(V);
        merge(U, V, ar);
    }

    public static void merge(int[] U, int[] V, int[] ar)
    {
        int i = 1;
        int j = 1;

         for(int k=1;k<U.length+V.length;k++)
         {
            if(U[k] > V[k])
            {
                ar[k] = V[k];
                j++;
            }
            else
            {
                ar[k] = U[k];
                i++;
            }
         }
    }
}
