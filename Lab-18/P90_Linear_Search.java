import java.util.Scanner;

public class P90_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter " + (i+1) + " element : ");
            ar[i] = sc.nextInt();
        }

        System.out.println("Enter number to search : ");
        int search = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(ar[i] == search)
            {
                System.out.println("Found at " + (i+1) + " position!!!");
                return;
            }
        }

        System.out.println("Element does not exists!!!");
    }
}
