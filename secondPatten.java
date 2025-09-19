public class secondPatten{
    public static void main(String[] args) {
        /*
* 
* * 
* * * 
* * * * 
* * * * * 
         */

     pattern1(5);
 
    }

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            //for every row , runs the col:
            for (int j = 0; j <= i ; j++) {
                System.out.print("*"+ " ");
            }
            //when one row is printed , we need to print the new lines:
            System.out.println();
        }

    }
}
