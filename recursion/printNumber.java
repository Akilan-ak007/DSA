package recursion;

public class printNumber {
    static void fun(int n , int m){
        if(n<m){
            return;
        }
        System.out.println(n);
        fun(n-1, m);
    }
    public static void main(String[] args) {
        fun(5,1);
    }
    
}
