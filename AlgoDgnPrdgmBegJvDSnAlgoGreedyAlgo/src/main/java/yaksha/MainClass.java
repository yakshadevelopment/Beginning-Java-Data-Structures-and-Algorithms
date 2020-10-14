package yaksha;

/* Program to find out efficient solution for the Water Connection Network Using Greedy Algo */
import java.util.*;

class MainClass {

	/* number of houses and number of pipes */
	static int n, p;
	static ArrayList<Integer> listResult = new ArrayList<Integer>();

	/* Array rd stores the ending vertex of pipe */
	static int rd[] = new int[1100];

	/* Array wd stores the value of diameters between two pipes */
	static int wt[] = new int[1100];

	// Array cd stores the
	// starting end of pipe
	static int cd[] = new int[1100];

	/* arraylist a, b, c are used to store the final output */
	static List<Integer> a = new ArrayList<Integer>();

	static List<Integer> b = new ArrayList<Integer>();

	static List<Integer> c = new ArrayList<Integer>();

	static int ans;

	static int dfs(int w) {
		if (cd[w] == 0)
			return w;
		if (wt[w] < ans)
			ans = wt[w];

		return dfs(cd[w]);
	}

	/* Method to perform calculations. */
	static ArrayList<Integer> calculateWaterNetworkUsingGreedyAlgo(WaterConnection waterConnection) {
		int arr[][] = waterConnection.getArray();
		p = waterConnection.getNumberOfPipes();
		n = waterConnection.getNumberOfHouses();

		int i = 0;

		while (i < p) {

			int q = arr[i][0];
			int h = arr[i][1];
			int t = arr[i][2];

			cd[q] = h;
			wt[q] = t;
			rd[h] = q;
			i++;
		}

		a = new ArrayList<Integer>();
		b = new ArrayList<Integer>();
		c = new ArrayList<Integer>();

		for (int j = 1; j <= n; ++j)

			/*
			 * If a pipe has no ending vertex but has starting vertex i.e is an outgoing
			 * pipe then we need to start searching with this vertex.
			 */

			if (rd[j] == 0 && cd[j] > 0) {
				ans = 1000000000;
				int w = dfs(j);

				/* We put the details of component in final output array */
				a.add(j);
				b.add(w);
				c.add(ans);
			}

		System.out.println(a.size());

		for (int j = 0; j < a.size(); ++j) {
			System.out.println(a.get(j) + " " + b.get(j) + " " + c.get(j));

			listResult.add(a.get(j));
			listResult.add(b.get(j));
			listResult.add(c.get(j));

		}

		return listResult;
	}

	// Main method
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of houses:");
		n = scanner.nextInt();// 9
		System.out.println("Enter number of pipes:");
		p = scanner.nextInt();// 6
		int array[][] = new int[p][p / 2];

		// set the value of the araray
		// to zero
		for (int i = 0; i < 1100; i++)
			rd[i] = cd[i] = wt[i] = 0;

		System.out.println("Enter Data");
		// Input : 7 4 98 5 9 72 4 6 10 2 8 22 9 7 17 3 1 66
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < p / 2; j++) {
				array[i][j] = scanner.nextInt();
			}
		}

		WaterConnection waterConnection = new WaterConnection(n, p, array);
		calculateWaterNetworkUsingGreedyAlgo(waterConnection);
		scanner.close();
	}
}
