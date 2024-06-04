import java.util.Scanner;

public class P21_Insert_Into_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int[] ar2 = new int[n+1];

        
        for(int i =0;i<n;i++)
        {
            System.out.print("Enter array element : " );
            ar[i] = sc.nextInt();
        }

        System.out.print("Enetr Number : ");
        int num = sc.nextInt();
        System.out.print("Enter Location : ");
        int l = sc.nextInt();
        
        for(int i=0;i<l;i++)
        {
            ar2[i] = ar[i];
        }

        ar2[l] = num;
        for(int i=l+1;i<=n;i++)
        {
            ar2[i] = ar[i-1];
        }

        for(int i=0;i<=n;i++)
        {
            System.out.print(ar2[i] + " ");
        }
    }
}