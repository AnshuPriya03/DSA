
import java.util.*;

public class Knapsacgreedy {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j = 0, max_qty, m, n;
		float sum = 0, max;
		Scanner in = new Scanner(System.in);
		int a[][] = new int[2][20];
		System.out.print("Enter noof items");
		n = in.nextInt();
		System.out.print("Enter the weight of each item");
		for (i = 0; i < n; i++) {
			a[0][i] = in.nextInt();
		}
		System.out.print("Enter the value of each items");
		for (i = 0; i < n; i++) {
			a[1][i] = in.nextInt();
		}
		System.out.print("Enter the maximum value of Knapsac");
		max_qty = in.nextInt();
		m = max_qty;
		while (m > 0) {
			max = 0;
			for (i = 0; i < n; i++) {
				if (((float) a[1][i]) / ((float) a[0][i]) > max) {
					max = ((float) a[1][i]) / ((float) a[0][i]);
					j = i;
				}
			}

			if (a[0][i] > m) {
				System.out.println("Quantity of item number:" + (j + 1) + " added is " + m);
				sum += m * max;
				m = -1;
			} else {
				System.out.println("Quantity of item number:" + (j + 1) + " added is " + a[0][j]);
				m -= a[0][j];
				sum += (float) a[1][j];
				a[1][j] = 0;
			}
		}

		System.out.println("The total profit is " + sum);
		in.close();

	}

}
