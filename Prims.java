
import java.util.*;

public class Prims {
    public static void main(String[] args) {
        int w[][] = new int[10][10];
        int i, j, n, s, k;
        int min;
        int sum = 0;
        int u = 0, v = 0;
        int flag = 0;
        int sol[] = new int[10];
        System.out.println("Enter the number of vertices");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 0; i < n; i++) {
            sol[i] = 0;
        }
        System.out.println("Enter the adjacency matrix");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                w[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the source vertex");
        s = in.nextInt();
        sol[s] = 1;
        k = 1;
        while (k <= n - 1) {
            min = 99;
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    if (sol[i] == 1 && sol[j] == 0)
                        if (i != j && w[i][j] < min) {
                            min = w[i][j];
                            u = i;
                            v = j;
                        }
            sol[v] = 1;
            sum = sum + min;
            k++;
            System.out.println(u + "->" + v + "=" + min);
        }
        for (i = 0; i < n; i++)
            if (sol[i] == 0) {
                flag = 1;
            }
        if (flag == 1)
            System.out.println("No spanning tree");
        else
            System.out.println("The cost of minimum spanning tree=" + sum);
        in.close();
    }
}
