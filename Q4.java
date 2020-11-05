public class Q4 {
	int binarySearch(int[] a, int l, int r, int x) { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (a[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (a[mid] > x) 
                return binarySearch(a, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(a, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    }

	public static void main(String[] args) {
		Q4 ob = new Q4(); 
        int[] a = { 2, 3, 4, 10, 40 }; 
        int N = a.length; 
        int x = 10;

        System.out.println("Given Array: ");
		for (int i = 0; i < N; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.println("\n\nBinary Search For X = " + x);

        int result = ob.binarySearch(a, 0, N - 1, x); 
        if (result == -1) 
            System.out.println("\nElement Is Not Present In Array.\n"); 
        else
            System.out.println("Element Is Present At Index : " + result);
		
	}
}