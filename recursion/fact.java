package recursion;

public class fact {
    static int fun(int n){
        if(n==1){
            return 0;
        }
        return n*fun(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fun(n));
    }
    
}
