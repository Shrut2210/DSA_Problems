import java.util.Scanner;

public class P14_Sum_M_To_N
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int sum = 0;

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter " + (i+1) + " element : ");
            ar[i] = sc.nextInt();
        }

        System.out.println("Enter first index : ");
        int m1 = sc.nextInt();
        System.out.println("Enter second index : ");
        int m2 = sc.nextInt();

        if ( m1 < m2 && m1 < n && m2 < n)
        {
            for(int i=m1;i<=m2;i++)
            {
                sum += ar[i];
            }
        }

        System.out.print(sum);
    }
}