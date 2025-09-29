package recursion;

import java.util.Scanner;


public class multipulRecursion {
    static  int fun(int n){
        if(n<=1){
            return n;
        }
        //multiple recursion:
        return fun(n-1)+fun(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("enter the number:");
        int n = in.nextInt();
        System.out.println(fun(n));
    }


    //leetcode 
//     class Solution {
//     static public int fib(int n) {
//         if(n<=1){
//             return n;
//         }
//         return fib (n-1)+ fib(n-2);
//     }
// }
    
}
