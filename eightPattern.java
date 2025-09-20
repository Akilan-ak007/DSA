

public class eightPattern {
    public static void main(String[] args) {
        /*
        Q/A:
0 0 0 0 0 0 0 0 0 
0 1 1 1 1 1 1 1 0 
0 1 2 2 2 2 2 1 0 
0 1 2 3 3 3 2 1 0 
0 1 2 3 4 3 2 1 0 
0 1 2 3 3 3 2 1 0 
0 1 2 2 2 2 2 1 0 
0 1 1 1 1 1 1 1 0 
0 0 0 0 0 0 0 0 0 
         */

        pattern8(4);
    }
    static void pattern8(int n){
        n=2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <=n; col++) {
                int atEverIndex=Math.min(Math.min(row, col),Math.min(n-row,n-col));
                System.out.print(atEverIndex + " ");
            }
            System.out.println();
        }

    }
}
