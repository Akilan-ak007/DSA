package recursion;

public class ValidPalindrome {
    //this code is in leetcode style :
    class Solution {
    public boolean isPalindrome(String s) {
      String c = s.toUpperCase().replaceAll("[^A-Z0-9]","");
      return helper (c,0);
    }
    boolean helper(String c , int i){
        int len = c.length();
        if(i>=len/2){
            return true ;
        }
        if(c.charAt(i)!=c.charAt(len-i-1)){
            return false;
        }
        return helper(c,i+1);
    }
}
//leetcode:
// class Solution {
//     public boolean isPalindrome(String s) {
//       String c = s.toUpperCase().replaceAll("[^A-Z0-9]","");
//       return helper (c,0);
//     }
//     boolean helper(String c , int i){
//         int len = c.length();
//         if(i>=len/2){
//             return true ;
//         }
//         if(c.charAt(i)!=c.charAt(len-i-1)){
//             return false;
//         }
//         return helper(c,i+1);
//     }
// }
}
