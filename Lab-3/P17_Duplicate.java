import java.util.Scanner;

public class P17_Duplicate
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int count = 0;

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter " + (i+1) + " element : ");
            ar[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ar[i] == ar[j])
                {
                    count++;
                    break;
                }
            }
        }

        if(count > 0)
        {
            System.out.println("Contains Duplicate");
        }
        else
        {
            System.out.println("Not Contains Duplicate");
        }
    }
}