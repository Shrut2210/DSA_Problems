import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class P20_Sort_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] names = new String[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter " + (i+1) + "name : ");
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        for(int i=0;i<n;i++)
        {
            System.out.print(names[i] + " ");
        }
    }
}
