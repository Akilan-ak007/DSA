public class threePatten {
    public static void main(String[] args) {
        /*
        Q/A
         *****
         ****
         ***
         **
         *
         */
         pattern3(4);
 
    }

    static void pattern3(int n){
        for (int i = 0; i <=n; i++) {
            //for every row , runs the col:
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("*"+ " ");
            }
            //when one row is printed , we need to print the new lines:
            System.out.println();
        }
    }
}
