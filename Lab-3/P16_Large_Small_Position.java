import java.util.Scanner;

public class P16_Large_Small_Position
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pn = 0;
        int pp = 0;

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter " + (i+1) + " element : ");
            ar[i] = sc.nextInt();

            if(min >= ar[i])
            {
                min = ar[i];
                pn = i;
            }

            if(max <= ar[i])
            {
                max = ar[i];
                pp = i;
            }
        }

        System.out.println("Position of negative number " + (pn+1));
        System.out.println("Position of positive number " + (pp+1));

    }
}