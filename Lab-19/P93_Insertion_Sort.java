import java.util.Scanner;

public class P93_Insertion_Sort {
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

        for(int i=1;i<n;i++)
        {
            int temp = ar[i];
            int j = i-1;

            while(j >= 0 && ar[j] > temp)
            {
                ar[j+1] = ar[j];
                j--;
            }

            ar[j+1] = temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }        
    }
}
