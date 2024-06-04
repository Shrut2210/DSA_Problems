import java.util.Scanner;

public class P36_Temprature_Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenhit : ");
        int f = sc.nextInt();

        System.out.println( "Temperature in Celcius is : " + ((9*f/5) + 32));

        System.out.println("Enter temperature in Celsius : ");
        int c = sc.nextInt();

        System.out.println( "Temperature in Fahrenhit is : " + (c-32)*5/9);
    }
}
