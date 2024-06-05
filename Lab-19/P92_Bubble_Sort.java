import java.util.Scanner;

public class P92_Bubble_Sort {
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

        int count = 0;

        for(int i=0;i<n-1 && count != n-1;i++)
        {
            count = 0;
            for(int j=0;j<n-i-1;j++)
            {
                if(ar[j] > ar[j+1])
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
                else
                {
                    count++;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}
