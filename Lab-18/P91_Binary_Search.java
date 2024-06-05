import java.util.Scanner;

public class P91_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int ar[] = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter " + (i+1) + " element : ");
            ar[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int temp = 0;
            for(int j=i+1;j<n;j++)
            {
                if(ar[i] > ar[j])
                {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }

        System.out.println("Enter number to search : ");
        int search = sc.nextInt();

        int left = 0;
        int right = n-1;

        while(left<right)
        {
            int mid = (left+right)/2;

            if(search > ar[mid])
            {
                left = mid + 1;
            }
            else if(search < ar[mid])
            {
                right = mid-1;
            }
            else if(search == ar[mid])
            {
                System.out.println("Found at " + (mid+1) + " position!!!");
                return;
            }
        }

        System.out.println("No data found!!");
    }
}
