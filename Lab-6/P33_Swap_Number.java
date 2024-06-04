import java.util.Scanner;

public class P33_Swap_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(swap(a,b));
    }

    public static String swap(int a,int b)
    {
        int c = a;
        a = b;
        b = c;

        return (a + " " + b);
    }
}
