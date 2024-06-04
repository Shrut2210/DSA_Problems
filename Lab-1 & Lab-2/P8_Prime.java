import java.util.Scanner;

public class P8_Prime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int r = sc.nextInt();
        int count = 0;

        for(int i=2;i<r;i++)
        {
            if(r%i == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}