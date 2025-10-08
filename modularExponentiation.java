package maths_combinations;

public class modularExponentiation {
    static int modExp(int x, int n, int M) {
        int res = 1;
        x = x % M; // Reduce x initially

        while (n > 0) {
            if ((n & 1) == 1) // if n is odd
                res = (res * x) % M;

            x = (x * x) % M; // square the base
            n = n / 2;       // divide exponent by 2
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(modExp(3, 2, 4));
    }
}