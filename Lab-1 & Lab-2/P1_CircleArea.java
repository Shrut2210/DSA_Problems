import java.util.Scanner;

public class P1_CircleArea
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int r = sc.nextInt();

        double area = 3.14*(double)r*(double)r;
        System.out.println(area);
    }
}