import java.util.Scanner;

public class P10_Days_To_YWD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total days");
        int d = sc.nextInt();

        int w = 0;
        int y = 0;

        int temp = d%365;

        y = d/365;

        w = temp/7;

        d = temp%7;

        System.out.println(y + " " + w + " " + d);
    }
}
