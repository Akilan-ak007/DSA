package recursion;

import java.util.Scanner;

public class sumOfNum {
    static void fun(int i , int sum){

        if(i<1){
            System.out.println(sum);
            return;
        }
        fun(i-1, sum+i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        fun(i, 0);

    }
}
