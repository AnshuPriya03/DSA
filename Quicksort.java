
import java.util.*;

public class Quicksort {

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
        Qsort(a, low, high);
        long t2 = System.nanoTime();
        long timetaken = t2 - t1;
        System.out.println("The sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Time taken to sort the array " + timetaken);

    }

    public static void Qsort(int a[], int low, int high) {
        if (low < high) {
            int k = Partition(a, low, high);
            Qsort(a, low, k - 1);
            Qsort(a, k + 1, high);
        }
    }

    public static int Partition(int[] a, int low, int high) {
        int Pivot = a[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (a[j] <= Pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return (i + 1);
    }
}
