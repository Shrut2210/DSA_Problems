import java.util.Scanner;

public class P9_Second_To_HMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds : ");
        int s = sc.nextInt();

        int m = 0;
        int h = 0;

        int temp = s%3600;

        h = s/3600;

        m = temp/60;
        temp = temp%60;

        System.out.println(h + " " + m + " " + temp );
    }
}
