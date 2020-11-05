public class Q3 {
	public static int search(int a[], int x) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if (a[i] == x)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 10, 40 };
		int x = 10;
		int N = a.length;

		System.out.println("Given Array: ");
		for (int i = 0; i < N; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.println("\n\nLinearly Searching For X = " + x);

		int result = search(a, x);
		if (result == -1)
			System.out.println("\nElement Is Not Present In Array.\n");
		else
			System.out.println("Element Is Present At Index : " + result);
	}
}