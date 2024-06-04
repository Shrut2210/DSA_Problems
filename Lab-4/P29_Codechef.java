import java.util.*;

public class P29_Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test case : ");
        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            System.out.println("Enter size of array : ");
            int n = sc.nextInt();
            int ar1[] = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element : ");
                ar1[i] = sc.nextInt();
            }

            int ar2[] = new int[n];
            int hammingNum = n;

            Arrays.sort(ar1);

            for (int i = 0; i < n; i += 2) {
                ar2[i] = ar1[(i + n) / 2];

                if(i+1 != n)
                {
                    ar2[i + 1] = ar1[i];
                }

                if ((i + n) / 2 < n) {
                    hammingNum--;
                }
            }

            System.err.println(hammingNum);

            for (int i = 0; i < n; i++) {
                System.out.print(ar2[i] + " ");
            }
        }

    }
}
