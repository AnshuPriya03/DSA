
import java.util.*;

public class Ssort {

    public static int[] a = new int[500000];

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int i, j = 0, temp;
        System.out.println("Enter the no. of elements:");
        int n = in.nextInt();
        Random r = new Random();
        for (i = 0; i < n; i++) {
            a[i] = r.nextInt(50000);
        }
        // time complexity
        long t1 = System.nanoTime();
        Selectionsort(n);
        long t2 = System.nanoTime();
        long timetaken = t2 - t1;
        System.out.println("The sorted array is:");
        for (i = 0; i < n; i++) {
            System.out.println(" " + a[i]);
        }
        System.out.println("Time taken to sort the array " + timetaken);

    }

    public static void Selectionsort(int n) {
        for (int i = 0; i <= n - 2; i++) {
            int minimum = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (a[j] < a[minimum]) {
                    minimum = j;
                }
            }
            int temp = a[i];
            a[i] = a[minimum];
            a[minimum] = temp;
        }
    }

}
