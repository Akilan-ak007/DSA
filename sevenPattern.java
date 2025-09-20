public class sevenPattern {
    public static void main(String[] args) {
        /*
    1
   212
  32123
 4321234
543212345
         */
         pattern6 (5);
 
    }

    static void pattern6(int n){
        for (int row = 1; row <=n; row++) {

            for (int space = 0; space < n-row; space++ ){
                System.out.print(" ");
            }

            for (int col = row; col >=1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=row; col++){
                    System.out.print(col);
       }
            System.out.println();
 
        }
    }
}

