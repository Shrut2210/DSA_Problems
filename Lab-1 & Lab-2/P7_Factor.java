import java.util.Scanner;

public class P7_Factor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++)
        {
            if(r%i == 0)
            {
               System.out.println(i);
            }
        }

        
    }
}