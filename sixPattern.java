

public class sixPattern {
    public static void main(String[] args) {
                      pattern6 (5);
 
    }

    static void pattern6(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRows = row > n ? 2 * n - row : row;

            int noOfSpace = n - totalColsInRows;
            for (int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }
            
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* " );
            }
            System.out.println();
 
        }
    }
}