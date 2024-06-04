import java.util.Scanner;

public class P4_Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int r = sc.nextInt();
        int fact = 1;

        for(int i=1;i<=r;i++)
        {
            fact *= i;
        }

        System.out.println(fact);
    }
}