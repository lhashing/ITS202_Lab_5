public class Q1 {
	public static void main(String[] args) {
		int R = 10;

		int[] a = {5,3,7,4,6,2,0,9,1,8};
		int N = a.length;
		int[] aux = new int[N];
		int[] count = new int[R+1];

		System.out.println("Given Array: ");
		for (int i = 0; i < N; i++) {
			System.out.print(" " + a[i]);
		}

		// Compute frequency counts.
		for (int i = 0; i < N; i++) {
			count[a[i] + 1]++;
		}

		// Transform counts to indices.
		for (int r = 0; r < R; r++) {
			count[r+1] += count[r];
		}

		// Distribute the records.
		for (int i = 0; i < N; i++) {
			aux[count[a[i]]++] = a[i];
		}

		System.out.println("\nKey-indexed Counting: ");
		// Copy back.
		for (int i = 0; i < N; i++) {
			a[i] = aux[i];
			System.out.print(" " + aux[i]);
		}
		System.out.println();


	}
}