public class Q2 {
	public static void sort(String[] a, int W) {
		// Sort a[] on leading W characters.
		int N = a.length;
		int R = 256;
		String[] aux = new String[N];

		for (int d = W-1; d >= 0; d--) {
			// Sort by key-indexed counting on dth char.
			int[] count = new int[R+1];

			// Compute frequency counts.
			for (int i = 0; i < N; i++) {
				count[a[i].charAt(d) + 1]++;
			}

			// Transform counts to indices.
			for (int r = 0; r < R; r++) {
				count[r+1] += count[r];
			}

			// Distribute.
			for (int i = 0; i < N; i++) {
				aux[count[a[i].charAt(d)]++] = a[i];
			}

			// Copy back.
			for (int i = 0; i < N; i++) {
				a[i] = aux[i];	
			}
		}
	}

	public static void main(String[] args) {
		String[] a = {"Nima", "Dawa", "Karma"};
		int N = a.length;
		
		int W = a[0].length();
        for (int i = 0; i < N; i++)
            assert a[i].length() == W : "Strings Must Have Fixed Length";
		
        System.out.println("Given Array String: ");
		for (int i = 0; i < N; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();

		sort(a, W);

		System.out.println("\nLSD Radix Sort Of Given Array: ");
		for (int i = 0; i < N; i++)
        	System.out.println(a[i]);
	}
}