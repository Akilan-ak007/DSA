
import java.util.Scanner;

public class firstPattern {
    public static void main(String[] args) {
        /*
         q/a
         ****
         ****
         ****
         ****
         */
        Scanner n = new Scanner(System.in);
        System.out.print("give the size of the pattem:");
        int na = n.nextInt();
        for (int i =0; i< na; i++) {
            for(int j=0;j<na;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    
}
