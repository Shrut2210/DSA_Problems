import java.util.Scanner;

public class P30_SumMatrix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] ar1 = new int[2][2];
        int[][] ar2 = new int[2][2];
        int[][] ar3 = new int[2][2];

        System.out.print("enter first matrix element : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar1[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter second matrix element : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar2[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar3[i][j] = ar1[i][j] + ar2[i][j];
                System.out.print(ar3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}