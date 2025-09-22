package hashing;

import java.util.Scanner;

public class basicHashing {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequency (hashing)
        int[] hash = new int[13];  // fixed size 13 like in your C++ code
        for (int i = 0; i < n; i++) {
            if (arr[i] < 13) {  // safety check to avoid ArrayIndexOutOfBounds
                hash[arr[i]]++;
            }
        }

        // Queries
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            // Fetch
            if (number < 13) {
                System.out.println(hash[number]);
            } else {
                System.out.println(0); // number not in range
            }
        }

        sc.close();
        
    }
}