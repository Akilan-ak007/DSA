public class fourPattern {
    public static void main(String[] args) {
        /*
         1
         12
         123
         1234
         */
         pattern4 (5);
 
    }

    static void pattern4(int n){
        for (int row = 1; row < n; row++) {
            //for every row , runs the col:
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            //when one row is printed , we need to print the new lines:
            System.out.println();
        }
    }
}
