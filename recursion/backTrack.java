package recursion;

public class backTrack {
    static void fun(int n , int m){
        if(n>m){
            return;
        }
        fun(n+1, m);
        System.out.println(n);
    }
    public static void main(String[] args) {
        fun(1, 3);
    }
}
