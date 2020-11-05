public class Q1usingchar { 
    void sort(char a[]) { 
        int N = a.length; 
  
        // The aux character aay that will have sorted a 
        char[] aux = new char[N]; 
  
        // Create a count aay to store count of inidividul 
        // characters and initialize count aay as 0 
        int count[] = new int[256]; 
        for (int i = 0; i < 256; ++i) 
            count[i] = 0; 
  
        // store count of each character 
        for (int i = 0; i < N; ++i) 
            ++count[a[i]]; 
  
        // Change count[i] so that count[i] now contains actual 
        // position of this character in aux aay 
        for (int i = 1; i <= 255; ++i) 
            count[i] += count[i - 1]; 
  
        // Build the aux character aay 
        // To make it stable we are operating in reverse order. 
        for (int i = N - 1; i >= 0; i--) { 
            aux[count[a[i]] - 1] = a[i]; 
            --count[a[i]]; 
        } 
  
        // Copy the aux aay to a, so that a now 
        // contains sorted characters 
        for (int i = 0; i < N; ++i) 
            a[i] = aux[i]; 
    } 
  
    // Driver method 
    public static void main(String args[]) { 
        Q1usingchar ob = new Q1usingchar(); 
        char[] a = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd' }; 
        int N = a.length;

        System.out.println("Given Array Character: ");
        for (int i = 0; i < N; i++) {
            System.out.print(" " + a[i]);
        }

        ob.sort(a); 
  
        System.out.println("\n\nKey-indexed Sorting Character: "); 
        for (int i = 0; i < a.length; ++i) 
            System.out.print(" " + a[i]);
        System.out.println();
    } 
} 