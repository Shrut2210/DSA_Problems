import java.util.*;

public class P96_MergeSort {
    public static void conquer(int a[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (a[idx1] <= a[idx2]) {
                merged[x++] = a[idx1++];
            } else {
                merged[x++] = a[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = a[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = a[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            a[j] = merged[i];
        }
    }

    public static void divide(int a[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(a, si, mid);
        divide(a, mid + 1, ei);
        conquer(a, si, mid, ei);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter " + (i+1) + " Element : ");;
            a[i] = sc.nextInt();
        }
        divide(a, 0, n - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}