import java.util.Scanner;

public class P2_OddEven
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int r = sc.nextInt();

        if(r%2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}