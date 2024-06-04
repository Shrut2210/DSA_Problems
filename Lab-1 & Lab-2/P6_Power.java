import java.util.Scanner;

public class P6_Power
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number : ");
        int base = sc.nextInt();
        System.out.println("Enter power number : ");
        int power = sc.nextInt();
        int temp = 1;

        for(int i=1;i<=power;i++)
        {
            temp *= base;
        }

        System.out.println(temp);
    }
}