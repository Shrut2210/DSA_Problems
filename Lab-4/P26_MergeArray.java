import java.util.Scanner;
public class P26_MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first array size : ");
        int n = sc.nextInt();
        int[] ar1 = new int[n];

        System.out.println("Enter second array size : ");
        int m = sc.nextInt();
        int[] ar2 = new int[m];

        int[] ar3 = new int[m+n];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter first array element : ");
            ar1[i] = sc.nextInt();
            ar3[i] = ar1[i];
        }

        for(int i=0;i<m;i++)
        {
            System.out.println("Enter second array element : ");
            ar2[i] = sc.nextInt();
            ar3[i+n] = ar2[i];
        }

        for(int i=0;i<(m+n);i++)
        {
            System.out.print(ar3[i] + " ");
        }
    }
}
