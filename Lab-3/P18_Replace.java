import java.util.Scanner;

public class P18_Replace
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        int a,b,pa,pb;
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");

        b = sc.nextInt();
        pa = -1;

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter " + (i+1) + " element : ");
            ar[i] = sc.nextInt();

            if(ar[i] == a)
            {
                pa = i;
            }
        }

        if(pa == -1)
        {
            System.out.println("Number doesn't exist..");
        }
        else
        {
            ar[pa] = b;
            System.out.println("index of a " + pa);

            for(int i=0;i<n;i++)
            {
                System.out.print(ar[i] + " ");
            }
        }

    }
}