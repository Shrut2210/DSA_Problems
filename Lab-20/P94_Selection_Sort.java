import java.util.Scanner;

public class P94_Selection_Sort {
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

        for(int i=0;i<n;i++)
        {
            int j = i+1;
            int min = ar[i];
            int temp = i;
            while(j < n)
            {
                if(min > ar[j])
                {
                    min = ar[j];
                    temp = j;
                }
                j++;
            }

            ar[temp] = ar[i];
            ar[i] = min;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i] + " ");
        }
    }
}
