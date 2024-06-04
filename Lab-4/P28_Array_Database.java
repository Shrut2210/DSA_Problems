import java.util.Scanner;

public class P28_Array_Database {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0;i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double avg(int[] arr) {
        int sum = sum(arr);
        return (double) sum / arr.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int [] ar = new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element : ");
            ar[i] = sc.nextInt();
        }

        System.out.println("Sum is : " + sum(ar));
        System.out.println("Max is : " + max(ar));
        System.out.println("Min is : " + min(ar));
        System.out.println("Average is : " + avg(ar));

    }
}
