
import java.util.*;

public class Mergesort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Enter the no. of elements:");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        int low = 0, high = n - 1;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(50000000);
        }
        // time complexity
        long t1 = System.nanoTime();
        Msort(a, low, high);
        long t2 = System.nanoTime();
        long timetaken = t2 - t1;
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Time taken to sort the array " + timetaken);

    }

    public static void Msort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            Msort(a, low, mid);
            Msort(a, mid + 1, high);
            Merge(a, low, mid, high);
        }
    }

    public static void Merge(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] c = new int[high + 1];

        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                c[k] = a[i];
                i = i + 1;
                k = k + 1;
            } else {
                c[k] = a[j];
                j = j + 1;
                k = k + 1;
            }
        }

        while (i <= mid) {
            c[k] = a[i];
            k = k + 1;
            i = i + 1;

        }

        while (j <= high) {
            c[k] = a[j];
            k = k + 1;
            j = j + 1;
        }
        for (i = low; i <= high; i++) {
            a[i] = c[i];
        }
    }

}
