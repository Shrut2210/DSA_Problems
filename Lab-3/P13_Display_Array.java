import java.util.Scanner;

public class P13_Display_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter " + (i+1) + " element : ");
            ar[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}